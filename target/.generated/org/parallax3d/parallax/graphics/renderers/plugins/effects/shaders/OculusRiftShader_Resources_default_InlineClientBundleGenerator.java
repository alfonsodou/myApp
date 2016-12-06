package org.parallax3d.parallax.graphics.renderers.plugins.effects.shaders;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class OculusRiftShader_Resources_default_InlineClientBundleGenerator implements org.parallax3d.parallax.graphics.renderers.plugins.effects.shaders.OculusRiftShader.Resources {
  private static OculusRiftShader_Resources_default_InlineClientBundleGenerator _instance0 = new OculusRiftShader_Resources_default_InlineClientBundleGenerator();
  private void getFragmentShaderInitializer() {
    getFragmentShader = new org.parallax3d.parallax.system.SourceTextResource() {
      // jar:file:/Users/alfonso/.m2/repository/org/parallax3d/parallax/parallax-renderer-plugins/2.0-SNAPSHOT/parallax-renderer-plugins-2.0-SNAPSHOT-sources.jar!/org/parallax3d/parallax/graphics/renderers/plugins/effects/shaders/source/oculusRift.fs.glsl
      public String getText() {
        return "uniform vec2 scale;\nuniform vec2 scaleIn;\nuniform vec2 lensCenter;\nuniform vec4 hmdWarpParam;\nuniform vec4 chromAbParam;\nuniform sampler2D texid;\nvarying vec2 vUv;\nvoid main()\n{\n  vec2 uv = (vUv*2.0)-1.0; // range from [0,1] to [-1,1]\n  vec2 theta = (uv-lensCenter)*scaleIn;\n  float rSq = theta.x*theta.x + theta.y*theta.y;\n  vec2 rvector = theta*(hmdWarpParam.x + hmdWarpParam.y*rSq + hmdWarpParam.z*rSq*rSq + hmdWarpParam.w*rSq*rSq*rSq);\n  vec2 rBlue = rvector * (chromAbParam.z + chromAbParam.w * rSq);\n  vec2 tcBlue = (lensCenter + scale * rBlue);\n  tcBlue = (tcBlue+1.0)/2.0; // range from [-1,1] to [0,1]\n  if (any(bvec2(clamp(tcBlue, vec2(0.0,0.0), vec2(1.0,1.0))-tcBlue))) {\n    gl_FragColor = vec4(0.0, 0.0, 0.0, 1.0);\n    return;}\n  vec2 tcGreen = lensCenter + scale * rvector;\n  tcGreen = (tcGreen+1.0)/2.0; // range from [-1,1] to [0,1]\n  vec2 rRed = rvector * (chromAbParam.x + chromAbParam.y * rSq);\n  vec2 tcRed = lensCenter + scale * rRed;\n  tcRed = (tcRed+1.0)/2.0; // range from [-1,1] to [0,1]\n  gl_FragColor = vec4(texture2D(texid, tcRed).r, texture2D(texid, tcGreen).g, texture2D(texid, tcBlue).b, 1);\n}\n";
      }
      public String getName() {
        return "getFragmentShader";
      }
    }
    ;
  }
  private static class getFragmentShaderInitializer {
    static {
      _instance0.getFragmentShaderInitializer();
    }
    static org.parallax3d.parallax.system.SourceTextResource get() {
      return getFragmentShader;
    }
  }
  public org.parallax3d.parallax.system.SourceTextResource getFragmentShader() {
    return getFragmentShaderInitializer.get();
  }
  private void getVertexShaderInitializer() {
    getVertexShader = new org.parallax3d.parallax.system.SourceTextResource() {
      // jar:file:/Users/alfonso/.m2/repository/org/parallax3d/parallax/parallax-renderer-plugins/2.0-SNAPSHOT/parallax-renderer-plugins-2.0-SNAPSHOT-sources.jar!/org/parallax3d/parallax/graphics/renderers/plugins/effects/shaders/source/oculusRift.vs.glsl
      public String getText() {
        return "varying vec2 vUv;\nvoid main() {\n vUv = uv;\n	gl_Position = projectionMatrix * modelViewMatrix * vec4( position, 1.0 );\n}\n";
      }
      public String getName() {
        return "getVertexShader";
      }
    }
    ;
  }
  private static class getVertexShaderInitializer {
    static {
      _instance0.getVertexShaderInitializer();
    }
    static org.parallax3d.parallax.system.SourceTextResource get() {
      return getVertexShader;
    }
  }
  public org.parallax3d.parallax.system.SourceTextResource getVertexShader() {
    return getVertexShaderInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static org.parallax3d.parallax.system.SourceTextResource getFragmentShader;
  private static org.parallax3d.parallax.system.SourceTextResource getVertexShader;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      getFragmentShader(), 
      getVertexShader(), 
    };
  }
  public ResourcePrototype getResource(String name) {
    if (GWT.isScript()) {
      return getResourceNative(name);
    } else {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype>();
        resourceMap.put("getFragmentShader", getFragmentShader());
        resourceMap.put("getVertexShader", getVertexShader());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'getFragmentShader': return this.@org.parallax3d.parallax.graphics.renderers.plugins.effects.shaders.OculusRiftShader.Resources::getFragmentShader()();
      case 'getVertexShader': return this.@org.parallax3d.parallax.graphics.renderers.plugins.effects.shaders.OculusRiftShader.Resources::getVertexShader()();
    }
    return null;
  }-*/;
}
