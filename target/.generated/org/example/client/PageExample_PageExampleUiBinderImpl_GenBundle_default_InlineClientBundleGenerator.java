package org.example.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class PageExample_PageExampleUiBinderImpl_GenBundle_default_InlineClientBundleGenerator implements org.example.client.PageExample_PageExampleUiBinderImpl_GenBundle {
  private static PageExample_PageExampleUiBinderImpl_GenBundle_default_InlineClientBundleGenerator _instance0 = new PageExample_PageExampleUiBinderImpl_GenBundle_default_InlineClientBundleGenerator();
  private void styleInitializer() {
    style = new org.example.client.PageExample_PageExampleUiBinderImpl_GenCss_style() {
      public java.lang.String debugger() {
        return "EW3VBFC-a-a";
      }
      private boolean injected;
      public boolean ensureInjected() {
        if (!injected) {
          injected = true;
          com.google.gwt.dom.client.StyleInjector.inject(getText());
          return true;
        }
        return false;
      }
      public String getName() {
        return "style";
      }
      public String getText() {
        return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? (".EW3VBFC-a-a{position:fixed!important;top:10px;left:10px;z-index:100}.EW3VBFC-a-b{padding:15px 0}") : (".EW3VBFC-a-a{position:fixed!important;top:10px;right:10px;z-index:100}.EW3VBFC-a-b{padding:15px 0}");
      }
      public java.lang.String menu() {
        return "EW3VBFC-a-b";
      }
    }
    ;
  }
  private static class styleInitializer {
    static {
      _instance0.styleInitializer();
    }
    static org.example.client.PageExample_PageExampleUiBinderImpl_GenCss_style get() {
      return style;
    }
  }
  public org.example.client.PageExample_PageExampleUiBinderImpl_GenCss_style style() {
    return styleInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static org.example.client.PageExample_PageExampleUiBinderImpl_GenCss_style style;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      style(), 
    };
  }
  public ResourcePrototype getResource(String name) {
    if (GWT.isScript()) {
      return getResourceNative(name);
    } else {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype>();
        resourceMap.put("style", style());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'style': return this.@org.example.client.PageExample_PageExampleUiBinderImpl_GenBundle::style()();
    }
    return null;
  }-*/;
}
