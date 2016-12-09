/**
 * 
 */
package org.javahispano.jfootball.client;

import org.javahispano.jfootball.client.application.animation.MyAnimation;
import org.javahispano.jfootball.client.application.animation.MyAnimation2;
import org.javahispano.jfootball.client.application.animation.MyAnimation3;
import org.parallax3d.parallax.Animation;
import org.parallax3d.parallax.Log;
import org.parallax3d.parallax.platforms.gwt.GwtRenderingContext;
import org.parallax3d.parallax.system.AnimationReadyListener;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.Scheduler;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.ResizeComposite;
import com.google.gwt.user.client.ui.SimpleLayoutPanel;
import com.google.gwt.user.client.ui.Widget;

/**
 * @author alfonso
 *
 */
public class PageExample extends ResizeComposite implements AnimationReadyListener {

	private static PageExampleUiBinder uiBinder = GWT.create(PageExampleUiBinder.class);

	interface PageExampleUiBinder extends UiBinder<Widget, PageExample> {
	}

	public interface PanelReady {
		void onRenderingReady(GwtRenderingContext rendering);
	}

	/**
	 * The main menu used to navigate to examples.
	 */
	@UiField
	FlowPanel menu;

	/**
	 * Main panel where will be RenderingPanel located
	 */
	@UiField
	SimpleLayoutPanel content;

	@UiField
	Button button1;
	@UiField
	Button button2;
	@UiField
	Button button3;

	GwtRenderingContext rendering;

	PanelReady renderingReady;

	public PageExample() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	@Override
	protected void onLoad() {

		if (rendering == null) {
			Scheduler.get().scheduleDeferred(new Scheduler.ScheduledCommand() {
				@Override
				public void execute() {
					try {

						rendering = new GwtRenderingContext(PageExample.this.content);

						rendering.addAnimationReadyListener(PageExample.this);

						if (renderingReady != null)
							renderingReady.onRenderingReady(rendering);

					} catch (Throwable e) {
						String msg = "Sorry, your browser doesn't seem to support WebGL";
						Log.error("setRendering: " + msg, e);
					}
				}
			});
		} else {
			if (renderingReady != null)
				renderingReady.onRenderingReady(rendering);
		}

		super.onLoad();
	}

	public void addGwtReadyListener(PanelReady gwtReady) {
		this.renderingReady = gwtReady;
	}

	@UiHandler("button1")
	public void onButton1Click(ClickEvent e) {
		rendering.setAnimation(new MyAnimation());
	}

	@UiHandler("button2")
	public void onButton2Click(ClickEvent e) {
		rendering.setAnimation(new MyAnimation2());
	}

	@UiHandler("button3")
	public void onButton3Click(ClickEvent e) {
		rendering.setAnimation(new MyAnimation3());
	}

	@Override
	public void onAnimationReady(Animation animation) {
		// rendering.run();
	}

}
