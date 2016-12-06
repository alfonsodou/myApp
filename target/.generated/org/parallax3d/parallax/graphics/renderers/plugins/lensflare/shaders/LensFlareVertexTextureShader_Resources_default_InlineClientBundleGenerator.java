package org.parallax3d.parallax.graphics.renderers.plugins.lensflare.shaders;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class LensFlareVertexTextureShader_Resources_default_InlineClientBundleGenerator implements org.parallax3d.parallax.graphics.renderers.plugins.lensflare.shaders.LensFlareVertexTextureShader.Resources {
  private static LensFlareVertexTextureShader_Resources_default_InlineClientBundleGenerator _instance0 = new LensFlareVertexTextureShader_Resources_default_InlineClientBundleGenerator();
  private void getFragmentShaderInitializer() {
    getFragmentShader = new org.parallax3d.parallax.system.SourceTextResource() {
      // jar:file:/Users/alfonso/.m2/repository/org/parallax3d/parallax/parallax-renderer-plugins/2.0-SNAPSHOT/parallax-renderer-plugins-2.0-SNAPSHOT-sources.jar!/org/parallax3d/parallax/graphics/renderers/plugins/lensflare/shaders/source/lensFlareVertexTexture.fs.glsl
      public String getText() {
        return "uniform lowp int renderType;\n\nuniform sampler2D map;\nuniform float opacity;\nuniform vec3 color;\n\nvarying vec2 vUV;\nvarying float vVisibility;\n\nvoid main() {\n\n						// pink square\n\n	if( renderType == 0 ) {\n\n		gl_FragColor = vec4( 1.0, 0.0, 1.0, 0.0 );\n\n						// restore\n\n	} else if( renderType == 1 ) {\n\n		gl_FragColor = texture2D( map, vUV );\n\n						// flare\n\n	} else {\n\n		vec4 texture = texture2D( map, vUV );\n		texture.a *= opacity * vVisibility;\n		gl_FragColor = texture;\n		gl_FragColor.rgb *= color;\n\n	}\n\n}\n";
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
      // jar:file:/Users/alfonso/.m2/repository/org/parallax3d/parallax/parallax-renderer-plugins/2.0-SNAPSHOT/parallax-renderer-plugins-2.0-SNAPSHOT-sources.jar!/org/parallax3d/parallax/graphics/renderers/plugins/lensflare/shaders/source/lensFlareVertexTexture.vs.glsl
      public String getText() {
        return "uniform lowp int renderType;\n\nuniform vec3 screenPosition;\nuniform vec2 scale;\nuniform float rotation;\n\nuniform sampler2D occlusionMap;\n\nattribute vec2 position;\nattribute vec2 uv;\n\nvarying vec2 vUV;\nvarying float vVisibility;\n\nvoid main() {\n\n	vUV = uv;\n\n	vec2 pos = position;\n\n	if( renderType == 2 ) {\n\n		vec4 visibility = texture2D( occlusionMap, vec2( 0.1, 0.1 ) );\n		visibility += texture2D( occlusionMap, vec2( 0.5, 0.1 ) );\n		visibility += texture2D( occlusionMap, vec2( 0.9, 0.1 ) );\n		visibility += texture2D( occlusionMap, vec2( 0.9, 0.5 ) );\n		visibility += texture2D( occlusionMap, vec2( 0.9, 0.9 ) );\n		visibility += texture2D( occlusionMap, vec2( 0.5, 0.9 ) );\n		visibility += texture2D( occlusionMap, vec2( 0.1, 0.9 ) );\n		visibility += texture2D( occlusionMap, vec2( 0.1, 0.5 ) );\n		visibility += texture2D( occlusionMap, vec2( 0.5, 0.5 ) );\n\n		vVisibility =        visibility.r / 9.0;\n		vVisibility *= 1.0 - visibility.g / 9.0;\n		vVisibility *=       visibility.b / 9.0;\n		vVisibility *= 1.0 - visibility.a / 9.0;\n\n		pos.x = cos( rotation ) * position.x - sin( rotation ) * position.y;\n		pos.y = sin( rotation ) * position.x + cos( rotation ) * position.y;\n\n	}\n\n	gl_Position = vec4( ( pos * scale + screenPosition.xy ).xy, screenPosition.z, 1.0 );\n\n}\n";
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
      case 'getFragmentShader': return this.@org.parallax3d.parallax.graphics.renderers.plugins.lensflare.shaders.LensFlareVertexTextureShader.Resources::getFragmentShader()();
      case 'getVertexShader': return this.@org.parallax3d.parallax.graphics.renderers.plugins.lensflare.shaders.LensFlareVertexTextureShader.Resources::getVertexShader()();
    }
    return null;
  }-*/;
}
