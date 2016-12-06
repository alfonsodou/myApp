package org.parallax3d.parallax.graphics.renderers.shaders;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class FresnelShader_Resources_default_InlineClientBundleGenerator implements org.parallax3d.parallax.graphics.renderers.shaders.FresnelShader.Resources {
  private static FresnelShader_Resources_default_InlineClientBundleGenerator _instance0 = new FresnelShader_Resources_default_InlineClientBundleGenerator();
  private void getFragmentShaderInitializer() {
    getFragmentShader = new org.parallax3d.parallax.system.SourceTextResource() {
      // jar:file:/Users/alfonso/.m2/repository/org/parallax3d/parallax/parallax/2.0-SNAPSHOT/parallax-2.0-SNAPSHOT.jar!/org/parallax3d/parallax/graphics/renderers/shaders/source/fresnel.fs.glsl
      public String getText() {
        return "uniform samplerCube tCube;\n\nvarying vec3 vReflect;\nvarying vec3 vRefract[3];\nvarying float vReflectionFactor;\n\nvoid main() {\n\n	vec4 reflectedColor = textureCube( tCube, vec3( -vReflect.x, vReflect.yz ) );\n	vec4 refractedColor = vec4( 1.0, 1.0, 1.0, 1.0 );\n\n	refractedColor.r = textureCube( tCube, vec3( -vRefract[0].x, vRefract[0].yz ) ).r;\n	refractedColor.g = textureCube( tCube, vec3( -vRefract[1].x, vRefract[1].yz ) ).g;\n	refractedColor.b = textureCube( tCube, vec3( -vRefract[2].x, vRefract[2].yz ) ).b;\n	refractedColor.a = 1.0;\n\n	gl_FragColor = mix( refractedColor, reflectedColor, clamp( vReflectionFactor, 0.0, 1.0 ) );\n\n}\n";
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
      // jar:file:/Users/alfonso/.m2/repository/org/parallax3d/parallax/parallax/2.0-SNAPSHOT/parallax-2.0-SNAPSHOT.jar!/org/parallax3d/parallax/graphics/renderers/shaders/source/fresnel.vs.glsl
      public String getText() {
        return "uniform float mRefractionRatio;\nuniform float mFresnelBias;\nuniform float mFresnelScale;\nuniform float mFresnelPower;\n\nvarying vec3 vReflect;\nvarying vec3 vRefract[3];\nvarying float vReflectionFactor;\n\nvoid main() {\n\n	vec4 mvPosition = modelViewMatrix * vec4( position, 1.0 );\n	vec4 mPosition = modelMatrix * vec4( position, 1.0 );\n\n	vec3 nWorld = normalize ( mat3( modelMatrix[0].xyz, modelMatrix[1].xyz, modelMatrix[2].xyz ) * normal );\n\n	vec3 I = mPosition.xyz - cameraPosition;\n\n	vReflect = reflect( I, nWorld );\n	vRefract[0] = refract( normalize( I ), nWorld, mRefractionRatio );\n	vRefract[1] = refract( normalize( I ), nWorld, mRefractionRatio * 0.99 );\n	vRefract[2] = refract( normalize( I ), nWorld, mRefractionRatio * 0.98 );\n	vReflectionFactor = mFresnelBias + mFresnelScale * pow( 1.0 + dot( normalize( I ), nWorld ), mFresnelPower );\n\n	gl_Position = projectionMatrix * mvPosition;\n\n}\n";
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
      case 'getFragmentShader': return this.@org.parallax3d.parallax.graphics.renderers.shaders.FresnelShader.Resources::getFragmentShader()();
      case 'getVertexShader': return this.@org.parallax3d.parallax.graphics.renderers.shaders.FresnelShader.Resources::getVertexShader()();
    }
    return null;
  }-*/;
}
