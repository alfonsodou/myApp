package org.parallax3d.parallax.graphics.renderers.plugins.sprite.shaders;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class SpriteShader_Resources_default_InlineClientBundleGenerator implements org.parallax3d.parallax.graphics.renderers.plugins.sprite.shaders.SpriteShader.Resources {
  private static SpriteShader_Resources_default_InlineClientBundleGenerator _instance0 = new SpriteShader_Resources_default_InlineClientBundleGenerator();
  private void getFragmentShaderInitializer() {
    getFragmentShader = new org.parallax3d.parallax.system.SourceTextResource() {
      // jar:file:/Users/alfonso/.m2/repository/org/parallax3d/parallax/parallax-renderer-plugins/2.0-SNAPSHOT/parallax-renderer-plugins-2.0-SNAPSHOT-sources.jar!/org/parallax3d/parallax/graphics/renderers/plugins/sprite/shaders/source/sprite.fs.glsl
      public String getText() {
        return "uniform vec3 color;\nuniform sampler2D map;\nuniform float opacity;\n\nuniform int fogType;\nuniform vec3 fogColor;\nuniform float fogDensity;\nuniform float fogNear;\nuniform float fogFar;\nuniform float alphaTest;\n\nvarying vec2 vUV;\n\nvoid main() {\n\n	vec4 texture = texture2D( map, vUV );\n\n	if ( texture.a < alphaTest ) discard;\n\n	gl_FragColor = vec4( color * texture.xyz, texture.a * opacity );\n\n	if ( fogType > 0 ) {\n\n		float depth = gl_FragCoord.z / gl_FragCoord.w;\n		float fogFactor = 0.0;\n\n		if ( fogType == 1 ) {\n\n			fogFactor = smoothstep( fogNear, fogFar, depth );\n\n		} else {\n\n			const float LOG2 = 1.442695;\n			float fogFactor = exp2( - fogDensity * fogDensity * depth * depth * LOG2 );\n			fogFactor = 1.0 - clamp( fogFactor, 0.0, 1.0 );\n\n		}\n\n		gl_FragColor = mix( gl_FragColor, vec4( fogColor, gl_FragColor.w ), fogFactor );\n\n	}\n\n}\n";
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
      // jar:file:/Users/alfonso/.m2/repository/org/parallax3d/parallax/parallax-renderer-plugins/2.0-SNAPSHOT/parallax-renderer-plugins-2.0-SNAPSHOT-sources.jar!/org/parallax3d/parallax/graphics/renderers/plugins/sprite/shaders/source/sprite.vs.glsl
      public String getText() {
        return "uniform mat4 modelViewMatrix;\nuniform mat4 projectionMatrix;\nuniform float rotation;\nuniform vec2 scale;\nuniform vec2 uvOffset;\nuniform vec2 uvScale;\n\nattribute vec2 position;\nattribute vec2 uv;\n\nvarying vec2 vUV;\n\nvoid main() {\n\n	vUV = uvOffset + uv * uvScale;\n\n	vec2 alignedPosition = position * scale;\n\n	vec2 rotatedPosition;\n	rotatedPosition.x = cos( rotation ) * alignedPosition.x - sin( rotation ) * alignedPosition.y;\n	rotatedPosition.y = sin( rotation ) * alignedPosition.x + cos( rotation ) * alignedPosition.y;\n\n	vec4 finalPosition;\n\n	finalPosition = modelViewMatrix * vec4( 0.0, 0.0, 0.0, 1.0 );\n	finalPosition.xy += rotatedPosition;\n	finalPosition = projectionMatrix * finalPosition;\n\n	gl_Position = finalPosition;\n\n}\n";
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
      case 'getFragmentShader': return this.@org.parallax3d.parallax.graphics.renderers.plugins.sprite.shaders.SpriteShader.Resources::getFragmentShader()();
      case 'getVertexShader': return this.@org.parallax3d.parallax.graphics.renderers.plugins.sprite.shaders.SpriteShader.Resources::getVertexShader()();
    }
    return null;
  }-*/;
}
