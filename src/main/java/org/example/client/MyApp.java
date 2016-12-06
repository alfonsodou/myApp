package org.example.client;

import org.example.client.application.animation.MyAnimation;
import org.parallax3d.parallax.Parallax;
import org.parallax3d.parallax.platforms.gwt.GwtParallax;
import org.parallax3d.parallax.platforms.gwt.GwtRenderingContext;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.user.client.History;
import com.google.gwt.user.client.ui.RootLayoutPanel;
import com.google.web.bindery.event.shared.EventBus;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class MyApp implements EntryPoint, Parallax.ParallaxListener {
	private PageExample container;

	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad() {
		ClientFactory clientFactory = GWT.create(ClientFactory.class);
		EventBus eventBus = clientFactory.getEventBus();

		GwtParallax.init(this);
	}

	@Override
	public void onParallaxApplicationReady(Parallax instance) {
		container = new PageExample();

		final ValueChangeHandler<String> historyHandler = new ValueChangeHandler<String>() {
			public void onValueChange(ValueChangeEvent<String> event) {
				RootLayoutPanel.get().clear();

				container.addGwtReadyListener(new PageExample.PanelReady() {
					@Override
					public void onRenderingReady(GwtRenderingContext rendering) {
						rendering.setAnimation(new MyAnimation());
					}
				});

				RootLayoutPanel.get().add(container);

			}
		};

		History.addValueChangeHandler(historyHandler);
		History.fireCurrentHistoryState();
	}

}