package org.parallax3d.parallax.graphics.renderers.shaders;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class DepthRGBAShader_Resources_default_InlineClientBundleGenerator implements org.parallax3d.parallax.graphics.renderers.shaders.DepthRGBAShader.Resources {
  private static DepthRGBAShader_Resources_default_InlineClientBundleGenerator _instance0 = new DepthRGBAShader_Resources_default_InlineClientBundleGenerator();
  private void getFragmentShaderInitializer() {
    getFragmentShader = new org.parallax3d.parallax.system.SourceTextResource() {
      // jar:file:/Users/alfonso/.m2/repository/org/parallax3d/parallax/parallax/2.0-SNAPSHOT/parallax-2.0-SNAPSHOT.jar!/org/parallax3d/parallax/graphics/renderers/shaders/source/depthRGBA.fs.glsl
      public String getText() {
        return "[*]\n\nvec4 pack_depth( const in float depth ) {\n\n	const vec4 bit_shift = vec4( 256.0 * 256.0 * 256.0, 256.0 * 256.0, 256.0, 1.0 );\n	const vec4 bit_mask = vec4( 0.0, 1.0 / 256.0, 1.0 / 256.0, 1.0 / 256.0 );\n	vec4 res = mod( depth * bit_shift * vec4( 255 ), vec4( 256 ) ) / vec4( 255 ); // vec4 res = fract( depth * bit_shift );\n	res -= res.xxyz * bit_mask;\n	return res;\n\n}\n\nvoid main() {\n\n[*]\n\n	#ifdef USE_LOGDEPTHBUF_EXT\n\n		gl_FragData[ 0 ] = pack_depth( gl_FragDepthEXT );\n\n	#else\n\n		gl_FragData[ 0 ] = pack_depth( gl_FragCoord.z );\n\n	#endif\n\n	//\"gl_FragData[ 0 ] = pack_depth( gl_FragCoord.z / gl_FragCoord.w );\n	//\"float z = ( ( gl_FragCoord.z / gl_FragCoord.w ) - 3.0 ) / ( 4000.0 - 3.0 );\n	//\"gl_FragData[ 0 ] = pack_depth( z );\n	//\"gl_FragData[ 0 ] = vec4( z, z, z, 1.0 );\n\n}\n";
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
      // jar:file:/Users/alfonso/.m2/repository/org/parallax3d/parallax/parallax/2.0-SNAPSHOT/parallax-2.0-SNAPSHOT.jar!/org/parallax3d/parallax/graphics/renderers/shaders/source/depthRGBA.vs.glsl
      public String getText() {
        return "[*]\n				\nvoid main() {\n				\n[*]\n				\n}\n";
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
      case 'getFragmentShader': return this.@org.parallax3d.parallax.graphics.renderers.shaders.DepthRGBAShader.Resources::getFragmentShader()();
      case 'getVertexShader': return this.@org.parallax3d.parallax.graphics.renderers.shaders.DepthRGBAShader.Resources::getVertexShader()();
    }
    return null;
  }-*/;
}
