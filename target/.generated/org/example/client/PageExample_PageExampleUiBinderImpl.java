// .ui.xml template last modified: 1480769042000
package org.example.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.safehtml.client.SafeHtmlTemplates;
import com.google.gwt.safehtml.shared.SafeHtml;
import com.google.gwt.safehtml.shared.SafeHtmlUtils;
import com.google.gwt.safehtml.shared.SafeHtmlBuilder;
import com.google.gwt.safehtml.shared.SafeUri;
import com.google.gwt.safehtml.shared.UriUtils;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.Widget;

public class PageExample_PageExampleUiBinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, org.example.client.PageExample>, org.example.client.PageExample.PageExampleUiBinder {

  interface Template extends SafeHtmlTemplates {
    @Template("Ejemplo 1")
    SafeHtml html1();
     
    @Template("Ejemplo 2")
    SafeHtml html2();
     
    @Template("Ejemplo 3")
    SafeHtml html3();
     
  }

  Template template = GWT.create(Template.class);


  public com.google.gwt.user.client.ui.Widget createAndBindUi(final org.example.client.PageExample owner) {


    return new Widgets(owner).get_f_DockLayoutPanel1();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final org.example.client.PageExample owner;


    final com.google.gwt.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1 = new com.google.gwt.event.dom.client.ClickHandler() {
      public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
        owner.onButton1Click((com.google.gwt.event.dom.client.ClickEvent) event);
      }
    };

    final com.google.gwt.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames2 = new com.google.gwt.event.dom.client.ClickHandler() {
      public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
        owner.onButton2Click((com.google.gwt.event.dom.client.ClickEvent) event);
      }
    };

    final com.google.gwt.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames3 = new com.google.gwt.event.dom.client.ClickHandler() {
      public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
        owner.onButton3Click((com.google.gwt.event.dom.client.ClickEvent) event);
      }
    };

    public Widgets(final org.example.client.PageExample owner) {
      this.owner = owner;
      build_style();  // generated css resource must be always created. Type: GENERATED_CSS. Precedence: 1
    }

    SafeHtml template_html1() {
      return template.html1();
    }
    SafeHtml template_html2() {
      return template.html2();
    }
    SafeHtml template_html3() {
      return template.html3();
    }

    /**
     * Getter for clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay called 1 times. Type: GENERATED_BUNDLE. Build precedence: 1.
     */
    private org.example.client.PageExample_PageExampleUiBinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private org.example.client.PageExample_PageExampleUiBinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final org.example.client.PageExample_PageExampleUiBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (org.example.client.PageExample_PageExampleUiBinderImpl_GenBundle) GWT.create(org.example.client.PageExample_PageExampleUiBinderImpl_GenBundle.class);
      // Setup section.

      return clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay;
    }

    /**
     * Getter for style called 2 times. Type: GENERATED_CSS. Build precedence: 1.
     */
    private org.example.client.PageExample_PageExampleUiBinderImpl_GenCss_style style;
    private org.example.client.PageExample_PageExampleUiBinderImpl_GenCss_style get_style() {
      return style;
    }
    private org.example.client.PageExample_PageExampleUiBinderImpl_GenCss_style build_style() {
      // Creation section.
      style = get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay().style();
      // Setup section.
      style.ensureInjected();

      return style;
    }

    /**
     * Getter for f_DockLayoutPanel1 called 1 times. Type: DEFAULT. Build precedence: 1.
     */
    private com.google.gwt.user.client.ui.DockLayoutPanel get_f_DockLayoutPanel1() {
      return build_f_DockLayoutPanel1();
    }
    private com.google.gwt.user.client.ui.DockLayoutPanel build_f_DockLayoutPanel1() {
      // Creation section.
      final com.google.gwt.user.client.ui.DockLayoutPanel f_DockLayoutPanel1 = new com.google.gwt.user.client.ui.DockLayoutPanel(com.google.gwt.dom.client.Style.Unit.PX);
      // Setup section.
      f_DockLayoutPanel1.addWest(get_f_FlowPanel2(), 340);
      f_DockLayoutPanel1.add(get_content());

      return f_DockLayoutPanel1;
    }

    /**
     * Getter for f_FlowPanel2 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.FlowPanel get_f_FlowPanel2() {
      return build_f_FlowPanel2();
    }
    private com.google.gwt.user.client.ui.FlowPanel build_f_FlowPanel2() {
      // Creation section.
      final com.google.gwt.user.client.ui.FlowPanel f_FlowPanel2 = (com.google.gwt.user.client.ui.FlowPanel) GWT.create(com.google.gwt.user.client.ui.FlowPanel.class);
      // Setup section.
      f_FlowPanel2.add(get_debuggerPanel());
      f_FlowPanel2.add(get_f_ScrollPanel3());

      return f_FlowPanel2;
    }

    /**
     * Getter for debuggerPanel called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.AbsolutePanel get_debuggerPanel() {
      return build_debuggerPanel();
    }
    private com.google.gwt.user.client.ui.AbsolutePanel build_debuggerPanel() {
      // Creation section.
      final com.google.gwt.user.client.ui.AbsolutePanel debuggerPanel = (com.google.gwt.user.client.ui.AbsolutePanel) GWT.create(com.google.gwt.user.client.ui.AbsolutePanel.class);
      // Setup section.
      debuggerPanel.setStylePrimaryName("" + get_style().debugger() + "");

      return debuggerPanel;
    }

    /**
     * Getter for f_ScrollPanel3 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.ScrollPanel get_f_ScrollPanel3() {
      return build_f_ScrollPanel3();
    }
    private com.google.gwt.user.client.ui.ScrollPanel build_f_ScrollPanel3() {
      // Creation section.
      final com.google.gwt.user.client.ui.ScrollPanel f_ScrollPanel3 = (com.google.gwt.user.client.ui.ScrollPanel) GWT.create(com.google.gwt.user.client.ui.ScrollPanel.class);
      // Setup section.
      f_ScrollPanel3.add(get_menu());
      f_ScrollPanel3.setHeight("90%");

      return f_ScrollPanel3;
    }

    /**
     * Getter for menu called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.FlowPanel get_menu() {
      return build_menu();
    }
    private com.google.gwt.user.client.ui.FlowPanel build_menu() {
      // Creation section.
      final com.google.gwt.user.client.ui.FlowPanel menu = (com.google.gwt.user.client.ui.FlowPanel) GWT.create(com.google.gwt.user.client.ui.FlowPanel.class);
      // Setup section.
      menu.add(get_button1());
      menu.add(get_button2());
      menu.add(get_button3());
      menu.setStylePrimaryName("" + get_style().menu() + "");

      this.owner.menu = menu;

      return menu;
    }

    /**
     * Getter for button1 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private com.google.gwt.user.client.ui.Button get_button1() {
      return build_button1();
    }
    private com.google.gwt.user.client.ui.Button build_button1() {
      // Creation section.
      final com.google.gwt.user.client.ui.Button button1 = (com.google.gwt.user.client.ui.Button) GWT.create(com.google.gwt.user.client.ui.Button.class);
      // Setup section.
      button1.setHTML(template_html1().asString());
      button1.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1);

      this.owner.button1 = button1;

      return button1;
    }

    /**
     * Getter for button2 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private com.google.gwt.user.client.ui.Button get_button2() {
      return build_button2();
    }
    private com.google.gwt.user.client.ui.Button build_button2() {
      // Creation section.
      final com.google.gwt.user.client.ui.Button button2 = (com.google.gwt.user.client.ui.Button) GWT.create(com.google.gwt.user.client.ui.Button.class);
      // Setup section.
      button2.setHTML(template_html2().asString());
      button2.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames2);

      this.owner.button2 = button2;

      return button2;
    }

    /**
     * Getter for button3 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private com.google.gwt.user.client.ui.Button get_button3() {
      return build_button3();
    }
    private com.google.gwt.user.client.ui.Button build_button3() {
      // Creation section.
      final com.google.gwt.user.client.ui.Button button3 = (com.google.gwt.user.client.ui.Button) GWT.create(com.google.gwt.user.client.ui.Button.class);
      // Setup section.
      button3.setHTML(template_html3().asString());
      button3.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames3);

      this.owner.button3 = button3;

      return button3;
    }

    /**
     * Getter for content called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.SimpleLayoutPanel get_content() {
      return build_content();
    }
    private com.google.gwt.user.client.ui.SimpleLayoutPanel build_content() {
      // Creation section.
      final com.google.gwt.user.client.ui.SimpleLayoutPanel content = (com.google.gwt.user.client.ui.SimpleLayoutPanel) GWT.create(com.google.gwt.user.client.ui.SimpleLayoutPanel.class);
      // Setup section.

      this.owner.content = content;

      return content;
    }
  }
}
