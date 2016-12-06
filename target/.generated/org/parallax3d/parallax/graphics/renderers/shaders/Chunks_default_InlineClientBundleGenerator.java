package org.parallax3d.parallax.graphics.renderers.shaders;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class Chunks_default_InlineClientBundleGenerator implements org.parallax3d.parallax.graphics.renderers.shaders.Chunks {
  private static Chunks_default_InlineClientBundleGenerator _instance0 = new Chunks_default_InlineClientBundleGenerator();
  private void getAlphamapFragmentInitializer() {
    getAlphamapFragment = new org.parallax3d.parallax.system.SourceTextResource() {
      // jar:file:/Users/alfonso/.m2/repository/org/parallax3d/parallax/parallax/2.0-SNAPSHOT/parallax-2.0-SNAPSHOT.jar!/org/parallax3d/parallax/graphics/renderers/shaders/chunk/alphamap_fragment.glsl
      public String getText() {
        return "#ifdef USE_ALPHAMAP\n\n	gl_FragColor.a *= texture2D( alphaMap, vUv ).g;\n\n#endif\n";
      }
      public String getName() {
        return "getAlphamapFragment";
      }
    }
    ;
  }
  private static class getAlphamapFragmentInitializer {
    static {
      _instance0.getAlphamapFragmentInitializer();
    }
    static org.parallax3d.parallax.system.SourceTextResource get() {
      return getAlphamapFragment;
    }
  }
  public org.parallax3d.parallax.system.SourceTextResource getAlphamapFragment() {
    return getAlphamapFragmentInitializer.get();
  }
  private void getAlphamapParsFragmentInitializer() {
    getAlphamapParsFragment = new org.parallax3d.parallax.system.SourceTextResource() {
      // jar:file:/Users/alfonso/.m2/repository/org/parallax3d/parallax/parallax/2.0-SNAPSHOT/parallax-2.0-SNAPSHOT.jar!/org/parallax3d/parallax/graphics/renderers/shaders/chunk/alphamap_pars_fragment.glsl
      public String getText() {
        return "#ifdef USE_ALPHAMAP\r\n\r\n	uniform sampler2D alphaMap;\r\n\r\n#endif\r\n";
      }
      public String getName() {
        return "getAlphamapParsFragment";
      }
    }
    ;
  }
  private static class getAlphamapParsFragmentInitializer {
    static {
      _instance0.getAlphamapParsFragmentInitializer();
    }
    static org.parallax3d.parallax.system.SourceTextResource get() {
      return getAlphamapParsFragment;
    }
  }
  public org.parallax3d.parallax.system.SourceTextResource getAlphamapParsFragment() {
    return getAlphamapParsFragmentInitializer.get();
  }
  private void getAlphatestFragmentInitializer() {
    getAlphatestFragment = new org.parallax3d.parallax.system.SourceTextResource() {
      // jar:file:/Users/alfonso/.m2/repository/org/parallax3d/parallax/parallax/2.0-SNAPSHOT/parallax-2.0-SNAPSHOT.jar!/org/parallax3d/parallax/graphics/renderers/shaders/chunk/alphatest_fragment.glsl
      public String getText() {
        return "#ifdef ALPHATEST\n\n	if ( gl_FragColor.a < ALPHATEST ) discard;\n\n#endif\n";
      }
      public String getName() {
        return "getAlphatestFragment";
      }
    }
    ;
  }
  private static class getAlphatestFragmentInitializer {
    static {
      _instance0.getAlphatestFragmentInitializer();
    }
    static org.parallax3d.parallax.system.SourceTextResource get() {
      return getAlphatestFragment;
    }
  }
  public org.parallax3d.parallax.system.SourceTextResource getAlphatestFragment() {
    return getAlphatestFragmentInitializer.get();
  }
  private void getBumpmapParsFragmentInitializer() {
    getBumpmapParsFragment = new org.parallax3d.parallax.system.SourceTextResource() {
      // jar:file:/Users/alfonso/.m2/repository/org/parallax3d/parallax/parallax/2.0-SNAPSHOT/parallax-2.0-SNAPSHOT.jar!/org/parallax3d/parallax/graphics/renderers/shaders/chunk/bumpmap_pars_fragment.glsl
      public String getText() {
        return "#ifdef USE_BUMPMAP\n\n	uniform sampler2D bumpMap;\n	uniform float bumpScale;\n\n			// Derivative maps - bump mapping unparametrized surfaces by Morten Mikkelsen\n			//	http://mmikkelsen3d.blogspot.sk/2011/07/derivative-maps.html\n\n			// Evaluate the derivative of the height w.r.t. screen-space using forward differencing (listing 2)\n\n	vec2 dHdxy_fwd() {\n\n		vec2 dSTdx = dFdx( vUv );\n		vec2 dSTdy = dFdy( vUv );\n\n		float Hll = bumpScale * texture2D( bumpMap, vUv ).x;\n		float dBx = bumpScale * texture2D( bumpMap, vUv + dSTdx ).x - Hll;\n		float dBy = bumpScale * texture2D( bumpMap, vUv + dSTdy ).x - Hll;\n\n		return vec2( dBx, dBy );\n\n	}\n\n	vec3 perturbNormalArb( vec3 surf_pos, vec3 surf_norm, vec2 dHdxy ) {\n\n		vec3 vSigmaX = dFdx( surf_pos );\n		vec3 vSigmaY = dFdy( surf_pos );\n		vec3 vN = surf_norm;		// normalized\n\n		vec3 R1 = cross( vSigmaY, vN );\n		vec3 R2 = cross( vN, vSigmaX );\n\n		float fDet = dot( vSigmaX, R1 );\n\n		vec3 vGrad = sign( fDet ) * ( dHdxy.x * R1 + dHdxy.y * R2 );\n		return normalize( abs( fDet ) * surf_norm - vGrad );\n\n	}\n\n#endif\n";
      }
      public String getName() {
        return "getBumpmapParsFragment";
      }
    }
    ;
  }
  private static class getBumpmapParsFragmentInitializer {
    static {
      _instance0.getBumpmapParsFragmentInitializer();
    }
    static org.parallax3d.parallax.system.SourceTextResource get() {
      return getBumpmapParsFragment;
    }
  }
  public org.parallax3d.parallax.system.SourceTextResource getBumpmapParsFragment() {
    return getBumpmapParsFragmentInitializer.get();
  }
  private void getColorFragmentInitializer() {
    getColorFragment = new org.parallax3d.parallax.system.SourceTextResource() {
      // jar:file:/Users/alfonso/.m2/repository/org/parallax3d/parallax/parallax/2.0-SNAPSHOT/parallax-2.0-SNAPSHOT.jar!/org/parallax3d/parallax/graphics/renderers/shaders/chunk/color_fragment.glsl
      public String getText() {
        return "#ifdef USE_COLOR\n\n	gl_FragColor = gl_FragColor * vec4( vColor, 1.0 );\n\n#endif\n";
      }
      public String getName() {
        return "getColorFragment";
      }
    }
    ;
  }
  private static class getColorFragmentInitializer {
    static {
      _instance0.getColorFragmentInitializer();
    }
    static org.parallax3d.parallax.system.SourceTextResource get() {
      return getColorFragment;
    }
  }
  public org.parallax3d.parallax.system.SourceTextResource getColorFragment() {
    return getColorFragmentInitializer.get();
  }
  private void getColorParsFragmentInitializer() {
    getColorParsFragment = new org.parallax3d.parallax.system.SourceTextResource() {
      // jar:file:/Users/alfonso/.m2/repository/org/parallax3d/parallax/parallax/2.0-SNAPSHOT/parallax-2.0-SNAPSHOT.jar!/org/parallax3d/parallax/graphics/renderers/shaders/chunk/color_pars_fragment.glsl
      public String getText() {
        return "#ifdef USE_COLOR\r\n\r\n	varying vec3 vColor;\r\n\r\n#endif\r\n";
      }
      public String getName() {
        return "getColorParsFragment";
      }
    }
    ;
  }
  private static class getColorParsFragmentInitializer {
    static {
      _instance0.getColorParsFragmentInitializer();
    }
    static org.parallax3d.parallax.system.SourceTextResource get() {
      return getColorParsFragment;
    }
  }
  public org.parallax3d.parallax.system.SourceTextResource getColorParsFragment() {
    return getColorParsFragmentInitializer.get();
  }
  private void getColorParsVertexInitializer() {
    getColorParsVertex = new org.parallax3d.parallax.system.SourceTextResource() {
      // jar:file:/Users/alfonso/.m2/repository/org/parallax3d/parallax/parallax/2.0-SNAPSHOT/parallax-2.0-SNAPSHOT.jar!/org/parallax3d/parallax/graphics/renderers/shaders/chunk/color_pars_vertex.glsl
      public String getText() {
        return "#ifdef USE_COLOR\r\n\r\n	varying vec3 vColor;\r\n\r\n#endif";
      }
      public String getName() {
        return "getColorParsVertex";
      }
    }
    ;
  }
  private static class getColorParsVertexInitializer {
    static {
      _instance0.getColorParsVertexInitializer();
    }
    static org.parallax3d.parallax.system.SourceTextResource get() {
      return getColorParsVertex;
    }
  }
  public org.parallax3d.parallax.system.SourceTextResource getColorParsVertex() {
    return getColorParsVertexInitializer.get();
  }
  private void getColorVertexInitializer() {
    getColorVertex = new org.parallax3d.parallax.system.SourceTextResource() {
      // jar:file:/Users/alfonso/.m2/repository/org/parallax3d/parallax/parallax/2.0-SNAPSHOT/parallax-2.0-SNAPSHOT.jar!/org/parallax3d/parallax/graphics/renderers/shaders/chunk/color_vertex.glsl
      public String getText() {
        return "#ifdef USE_COLOR\n\n	#ifdef GAMMA_INPUT\n\n		vColor = color * color;\n\n	#else\n\n		vColor = color;\n\n	#endif\n\n#endif";
      }
      public String getName() {
        return "getColorVertex";
      }
    }
    ;
  }
  private static class getColorVertexInitializer {
    static {
      _instance0.getColorVertexInitializer();
    }
    static org.parallax3d.parallax.system.SourceTextResource get() {
      return getColorVertex;
    }
  }
  public org.parallax3d.parallax.system.SourceTextResource getColorVertex() {
    return getColorVertexInitializer.get();
  }
  private void getDefaultNormalVertexInitializer() {
    getDefaultNormalVertex = new org.parallax3d.parallax.system.SourceTextResource() {
      // jar:file:/Users/alfonso/.m2/repository/org/parallax3d/parallax/parallax/2.0-SNAPSHOT/parallax-2.0-SNAPSHOT.jar!/org/parallax3d/parallax/graphics/renderers/shaders/chunk/defaultnormal_vertex.glsl
      public String getText() {
        return "vec3 objectNormal;\n\n#ifdef USE_SKINNING\n\n	objectNormal = skinnedNormal.xyz;\n\n#endif\n\n#if !defined( USE_SKINNING ) && defined( USE_MORPHNORMALS )\n\n	objectNormal = morphedNormal;\n\n#endif\n\n#if !defined( USE_SKINNING ) && ! defined( USE_MORPHNORMALS )\n\n	objectNormal = normal;\n\n#endif\n\n#ifdef FLIP_SIDED\n\n	objectNormal = -objectNormal;\n\n#endif\n\nvec3 transformedNormal = normalMatrix * objectNormal;";
      }
      public String getName() {
        return "getDefaultNormalVertex";
      }
    }
    ;
  }
  private static class getDefaultNormalVertexInitializer {
    static {
      _instance0.getDefaultNormalVertexInitializer();
    }
    static org.parallax3d.parallax.system.SourceTextResource get() {
      return getDefaultNormalVertex;
    }
  }
  public org.parallax3d.parallax.system.SourceTextResource getDefaultNormalVertex() {
    return getDefaultNormalVertexInitializer.get();
  }
  private void getDefaultVertexInitializer() {
    getDefaultVertex = new org.parallax3d.parallax.system.SourceTextResource() {
      // jar:file:/Users/alfonso/.m2/repository/org/parallax3d/parallax/parallax/2.0-SNAPSHOT/parallax-2.0-SNAPSHOT.jar!/org/parallax3d/parallax/graphics/renderers/shaders/chunk/default_vertex.glsl
      public String getText() {
        return "vec4 mvPosition;\n\n#ifdef USE_SKINNING\n\n	mvPosition = modelViewMatrix * skinned;\n\n#endif\n\n#if !defined( USE_SKINNING ) && defined( USE_MORPHTARGETS )\n\n	mvPosition = modelViewMatrix * vec4( morphed, 1.0 );\n\n#endif\n\n#if !defined( USE_SKINNING ) && ! defined( USE_MORPHTARGETS )\n\n	mvPosition = modelViewMatrix * vec4( position, 1.0 );\n\n#endif\n\ngl_Position = projectionMatrix * mvPosition;";
      }
      public String getName() {
        return "getDefaultVertex";
      }
    }
    ;
  }
  private static class getDefaultVertexInitializer {
    static {
      _instance0.getDefaultVertexInitializer();
    }
    static org.parallax3d.parallax.system.SourceTextResource get() {
      return getDefaultVertex;
    }
  }
  public org.parallax3d.parallax.system.SourceTextResource getDefaultVertex() {
    return getDefaultVertexInitializer.get();
  }
  private void getEnvmapFragmentInitializer() {
    getEnvmapFragment = new org.parallax3d.parallax.system.SourceTextResource() {
      // jar:file:/Users/alfonso/.m2/repository/org/parallax3d/parallax/parallax/2.0-SNAPSHOT/parallax-2.0-SNAPSHOT.jar!/org/parallax3d/parallax/graphics/renderers/shaders/chunk/envmap_fragment.glsl
      public String getText() {
        return "#ifdef USE_ENVMAP\n\n	vec3 reflectVec;\n\n	#if defined( USE_BUMPMAP ) || defined( USE_NORMALMAP ) || defined( PHONG )\n\n		vec3 cameraToVertex = normalize( vWorldPosition - cameraPosition );\n\n		// http://en.wikibooks.org/wiki/GLSL_Programming/Applying_Matrix_Transformations\n		// Transforming Normal Vectors with the Inverse Transformation\n\n		vec3 worldNormal = normalize( vec3( vec4( normal, 0.0 ) * viewMatrix ) );\n\n		if ( useRefract ) {\n\n			reflectVec = refract( cameraToVertex, worldNormal, refractionRatio );\n\n		} else { \n\n			reflectVec = reflect( cameraToVertex, worldNormal );\n\n		}\n\n	#else\n\n		reflectVec = vReflect;\n\n	#endif\n\n	#ifdef DOUBLE_SIDED\n\n		float flipNormal = ( -1.0 + 2.0 * float( gl_FrontFacing ) );\n		vec4 cubeColor = textureCube( envMap, flipNormal * vec3( flipEnvMap * reflectVec.x, reflectVec.yz ) );\n\n	#else\n\n		vec4 cubeColor = textureCube( envMap, vec3( flipEnvMap * reflectVec.x, reflectVec.yz ) );\n\n	#endif\n\n	#ifdef GAMMA_INPUT\n\n		cubeColor.xyz *= cubeColor.xyz;\n\n	#endif\n\n	if ( combine == 1 ) {\n\n		gl_FragColor.xyz = mix( gl_FragColor.xyz, cubeColor.xyz, specularStrength * reflectivity );\n\n	} else if ( combine == 2 ) {\n\n		gl_FragColor.xyz += cubeColor.xyz * specularStrength * reflectivity;\n\n	} else {\n\n		gl_FragColor.xyz = mix( gl_FragColor.xyz, gl_FragColor.xyz * cubeColor.xyz, specularStrength * reflectivity );\n\n	}\n\n#endif";
      }
      public String getName() {
        return "getEnvmapFragment";
      }
    }
    ;
  }
  private static class getEnvmapFragmentInitializer {
    static {
      _instance0.getEnvmapFragmentInitializer();
    }
    static org.parallax3d.parallax.system.SourceTextResource get() {
      return getEnvmapFragment;
    }
  }
  public org.parallax3d.parallax.system.SourceTextResource getEnvmapFragment() {
    return getEnvmapFragmentInitializer.get();
  }
  private void getEnvmapParsFragmentInitializer() {
    getEnvmapParsFragment = new org.parallax3d.parallax.system.SourceTextResource() {
      // jar:file:/Users/alfonso/.m2/repository/org/parallax3d/parallax/parallax/2.0-SNAPSHOT/parallax-2.0-SNAPSHOT.jar!/org/parallax3d/parallax/graphics/renderers/shaders/chunk/envmap_pars_fragment.glsl
      public String getText() {
        return "#ifdef USE_ENVMAP\n\n	uniform float reflectivity;\n	uniform samplerCube envMap;\n	uniform float flipEnvMap;\n	uniform int combine;\n\n	#if defined( USE_BUMPMAP ) || defined( USE_NORMALMAP ) || defined( PHONG )\n\n		uniform bool useRefract;\n		uniform float refractionRatio;\n\n	#else\n\n		varying vec3 vReflect;\n\n	#endif\n\n#endif";
      }
      public String getName() {
        return "getEnvmapParsFragment";
      }
    }
    ;
  }
  private static class getEnvmapParsFragmentInitializer {
    static {
      _instance0.getEnvmapParsFragmentInitializer();
    }
    static org.parallax3d.parallax.system.SourceTextResource get() {
      return getEnvmapParsFragment;
    }
  }
  public org.parallax3d.parallax.system.SourceTextResource getEnvmapParsFragment() {
    return getEnvmapParsFragmentInitializer.get();
  }
  private void getEnvmapParsVertexInitializer() {
    getEnvmapParsVertex = new org.parallax3d.parallax.system.SourceTextResource() {
      // jar:file:/Users/alfonso/.m2/repository/org/parallax3d/parallax/parallax/2.0-SNAPSHOT/parallax-2.0-SNAPSHOT.jar!/org/parallax3d/parallax/graphics/renderers/shaders/chunk/envmap_pars_vertex.glsl
      public String getText() {
        return "#if defined( USE_ENVMAP ) && ! defined( USE_BUMPMAP ) && ! defined( USE_NORMALMAP ) && ! defined( PHONG )\n\n	varying vec3 vReflect;\n\n	uniform float refractionRatio;\n	uniform bool useRefract;\n\n#endif\n";
      }
      public String getName() {
        return "getEnvmapParsVertex";
      }
    }
    ;
  }
  private static class getEnvmapParsVertexInitializer {
    static {
      _instance0.getEnvmapParsVertexInitializer();
    }
    static org.parallax3d.parallax.system.SourceTextResource get() {
      return getEnvmapParsVertex;
    }
  }
  public org.parallax3d.parallax.system.SourceTextResource getEnvmapParsVertex() {
    return getEnvmapParsVertexInitializer.get();
  }
  private void getEnvmapVertexInitializer() {
    getEnvmapVertex = new org.parallax3d.parallax.system.SourceTextResource() {
      // jar:file:/Users/alfonso/.m2/repository/org/parallax3d/parallax/parallax/2.0-SNAPSHOT/parallax-2.0-SNAPSHOT.jar!/org/parallax3d/parallax/graphics/renderers/shaders/chunk/envmap_vertex.glsl
      public String getText() {
        return "#if defined( USE_ENVMAP ) && ! defined( USE_BUMPMAP ) && ! defined( USE_NORMALMAP ) && ! defined( PHONG )\n\n	vec3 worldNormal = mat3( modelMatrix[ 0 ].xyz, modelMatrix[ 1 ].xyz, modelMatrix[ 2 ].xyz ) * objectNormal;\n	worldNormal = normalize( worldNormal );\n\n	vec3 cameraToVertex = normalize( worldPosition.xyz - cameraPosition );\n\n	if ( useRefract ) {\n\n		vReflect = refract( cameraToVertex, worldNormal, refractionRatio );\n\n	} else {\n\n		vReflect = reflect( cameraToVertex, worldNormal );\n\n	}\n\n#endif";
      }
      public String getName() {
        return "getEnvmapVertex";
      }
    }
    ;
  }
  private static class getEnvmapVertexInitializer {
    static {
      _instance0.getEnvmapVertexInitializer();
    }
    static org.parallax3d.parallax.system.SourceTextResource get() {
      return getEnvmapVertex;
    }
  }
  public org.parallax3d.parallax.system.SourceTextResource getEnvmapVertex() {
    return getEnvmapVertexInitializer.get();
  }
  private void getFogFragmentInitializer() {
    getFogFragment = new org.parallax3d.parallax.system.SourceTextResource() {
      // jar:file:/Users/alfonso/.m2/repository/org/parallax3d/parallax/parallax/2.0-SNAPSHOT/parallax-2.0-SNAPSHOT.jar!/org/parallax3d/parallax/graphics/renderers/shaders/chunk/fog_fragment.glsl
      public String getText() {
        return "#ifdef USE_FOG\n\n	#ifdef USE_LOGDEPTHBUF_EXT\n\n		float depth = gl_FragDepthEXT / gl_FragCoord.w;\n\n	#else\n\n		float depth = gl_FragCoord.z / gl_FragCoord.w;\n\n	#endif\n\n	#ifdef FOG_EXP2\n\n		const float LOG2 = 1.442695;\n		float fogFactor = exp2( - fogDensity * fogDensity * depth * depth * LOG2 );\n		fogFactor = 1.0 - clamp( fogFactor, 0.0, 1.0 );\n\n	#else\n\n		float fogFactor = smoothstep( fogNear, fogFar, depth );\n\n	#endif\n	\n	gl_FragColor = mix( gl_FragColor, vec4( fogColor, gl_FragColor.w ), fogFactor );\n\n#endif";
      }
      public String getName() {
        return "getFogFragment";
      }
    }
    ;
  }
  private static class getFogFragmentInitializer {
    static {
      _instance0.getFogFragmentInitializer();
    }
    static org.parallax3d.parallax.system.SourceTextResource get() {
      return getFogFragment;
    }
  }
  public org.parallax3d.parallax.system.SourceTextResource getFogFragment() {
    return getFogFragmentInitializer.get();
  }
  private void getFogParsFragmentInitializer() {
    getFogParsFragment = new org.parallax3d.parallax.system.SourceTextResource() {
      // jar:file:/Users/alfonso/.m2/repository/org/parallax3d/parallax/parallax/2.0-SNAPSHOT/parallax-2.0-SNAPSHOT.jar!/org/parallax3d/parallax/graphics/renderers/shaders/chunk/fog_pars_fragment.glsl
      public String getText() {
        return "#ifdef USE_FOG\r\n\r\n	uniform vec3 fogColor;\r\n\r\n	#ifdef FOG_EXP2\r\n\r\n		uniform float fogDensity;\r\n\r\n	#else\r\n\r\n		uniform float fogNear;\r\n		uniform float fogFar;\r\n	#endif\r\n\r\n#endif";
      }
      public String getName() {
        return "getFogParsFragment";
      }
    }
    ;
  }
  private static class getFogParsFragmentInitializer {
    static {
      _instance0.getFogParsFragmentInitializer();
    }
    static org.parallax3d.parallax.system.SourceTextResource get() {
      return getFogParsFragment;
    }
  }
  public org.parallax3d.parallax.system.SourceTextResource getFogParsFragment() {
    return getFogParsFragmentInitializer.get();
  }
  private void getLightmapFragmentInitializer() {
    getLightmapFragment = new org.parallax3d.parallax.system.SourceTextResource() {
      // jar:file:/Users/alfonso/.m2/repository/org/parallax3d/parallax/parallax/2.0-SNAPSHOT/parallax-2.0-SNAPSHOT.jar!/org/parallax3d/parallax/graphics/renderers/shaders/chunk/lightmap_fragment.glsl
      public String getText() {
        return "#ifdef USE_LIGHTMAP\n\n	gl_FragColor = gl_FragColor * texture2D( lightMap, vUv2 );\n\n#endif";
      }
      public String getName() {
        return "getLightmapFragment";
      }
    }
    ;
  }
  private static class getLightmapFragmentInitializer {
    static {
      _instance0.getLightmapFragmentInitializer();
    }
    static org.parallax3d.parallax.system.SourceTextResource get() {
      return getLightmapFragment;
    }
  }
  public org.parallax3d.parallax.system.SourceTextResource getLightmapFragment() {
    return getLightmapFragmentInitializer.get();
  }
  private void getLightmapParsFragmentInitializer() {
    getLightmapParsFragment = new org.parallax3d.parallax.system.SourceTextResource() {
      // jar:file:/Users/alfonso/.m2/repository/org/parallax3d/parallax/parallax/2.0-SNAPSHOT/parallax-2.0-SNAPSHOT.jar!/org/parallax3d/parallax/graphics/renderers/shaders/chunk/lightmap_pars_fragment.glsl
      public String getText() {
        return "#ifdef USE_LIGHTMAP\n\n	varying vec2 vUv2;\n	uniform sampler2D lightMap;\n\n#endif";
      }
      public String getName() {
        return "getLightmapParsFragment";
      }
    }
    ;
  }
  private static class getLightmapParsFragmentInitializer {
    static {
      _instance0.getLightmapParsFragmentInitializer();
    }
    static org.parallax3d.parallax.system.SourceTextResource get() {
      return getLightmapParsFragment;
    }
  }
  public org.parallax3d.parallax.system.SourceTextResource getLightmapParsFragment() {
    return getLightmapParsFragmentInitializer.get();
  }
  private void getLightmapParsVertexInitializer() {
    getLightmapParsVertex = new org.parallax3d.parallax.system.SourceTextResource() {
      // jar:file:/Users/alfonso/.m2/repository/org/parallax3d/parallax/parallax/2.0-SNAPSHOT/parallax-2.0-SNAPSHOT.jar!/org/parallax3d/parallax/graphics/renderers/shaders/chunk/lightmap_pars_vertex.glsl
      public String getText() {
        return "#ifdef USE_LIGHTMAP\n\n	varying vec2 vUv2;\n\n#endif";
      }
      public String getName() {
        return "getLightmapParsVertex";
      }
    }
    ;
  }
  private static class getLightmapParsVertexInitializer {
    static {
      _instance0.getLightmapParsVertexInitializer();
    }
    static org.parallax3d.parallax.system.SourceTextResource get() {
      return getLightmapParsVertex;
    }
  }
  public org.parallax3d.parallax.system.SourceTextResource getLightmapParsVertex() {
    return getLightmapParsVertexInitializer.get();
  }
  private void getLightmapVertexInitializer() {
    getLightmapVertex = new org.parallax3d.parallax.system.SourceTextResource() {
      // jar:file:/Users/alfonso/.m2/repository/org/parallax3d/parallax/parallax/2.0-SNAPSHOT/parallax-2.0-SNAPSHOT.jar!/org/parallax3d/parallax/graphics/renderers/shaders/chunk/lightmap_vertex.glsl
      public String getText() {
        return "#ifdef USE_LIGHTMAP\n\n	vUv2 = uv2;\n\n#endif";
      }
      public String getName() {
        return "getLightmapVertex";
      }
    }
    ;
  }
  private static class getLightmapVertexInitializer {
    static {
      _instance0.getLightmapVertexInitializer();
    }
    static org.parallax3d.parallax.system.SourceTextResource get() {
      return getLightmapVertex;
    }
  }
  public org.parallax3d.parallax.system.SourceTextResource getLightmapVertex() {
    return getLightmapVertexInitializer.get();
  }
  private void getLightsLambertParsVertexInitializer() {
    getLightsLambertParsVertex = new org.parallax3d.parallax.system.SourceTextResource() {
      // jar:file:/Users/alfonso/.m2/repository/org/parallax3d/parallax/parallax/2.0-SNAPSHOT/parallax-2.0-SNAPSHOT.jar!/org/parallax3d/parallax/graphics/renderers/shaders/chunk/lights_lambert_pars_vertex.glsl
      public String getText() {
        return "uniform vec3 ambient;\nuniform vec3 diffuse;\nuniform vec3 emissive;\n\nuniform vec3 ambientLightColor;\n\n#if MAX_DIR_LIGHTS > 0\n\n	uniform vec3 directionalLightColor[ MAX_DIR_LIGHTS ];\n	uniform vec3 directionalLightDirection[ MAX_DIR_LIGHTS ];\n\n#endif\n\n#if MAX_HEMI_LIGHTS > 0\n\n	uniform vec3 hemisphereLightSkyColor[ MAX_HEMI_LIGHTS ];\n	uniform vec3 hemisphereLightGroundColor[ MAX_HEMI_LIGHTS ];\n	uniform vec3 hemisphereLightDirection[ MAX_HEMI_LIGHTS ];\n\n#endif\n\n#if MAX_POINT_LIGHTS > 0\n\n	uniform vec3 pointLightColor[ MAX_POINT_LIGHTS ];\n	uniform vec3 pointLightPosition[ MAX_POINT_LIGHTS ];\n	uniform float pointLightDistance[ MAX_POINT_LIGHTS ];\n\n#endif\n\n#if MAX_SPOT_LIGHTS > 0\n\n	uniform vec3 spotLightColor[ MAX_SPOT_LIGHTS ];\n	uniform vec3 spotLightPosition[ MAX_SPOT_LIGHTS ];\n	uniform vec3 spotLightDirection[ MAX_SPOT_LIGHTS ];\n	uniform float spotLightDistance[ MAX_SPOT_LIGHTS ];\n	uniform float spotLightAngleCos[ MAX_SPOT_LIGHTS ];\n	uniform float spotLightExponent[ MAX_SPOT_LIGHTS ];\n\n#endif\n\n#ifdef WRAP_AROUND\n\n	uniform vec3 wrapRGB;\n\n#endif\n";
      }
      public String getName() {
        return "getLightsLambertParsVertex";
      }
    }
    ;
  }
  private static class getLightsLambertParsVertexInitializer {
    static {
      _instance0.getLightsLambertParsVertexInitializer();
    }
    static org.parallax3d.parallax.system.SourceTextResource get() {
      return getLightsLambertParsVertex;
    }
  }
  public org.parallax3d.parallax.system.SourceTextResource getLightsLambertParsVertex() {
    return getLightsLambertParsVertexInitializer.get();
  }
  private void getLightsLambertVertexInitializer() {
    getLightsLambertVertex = new org.parallax3d.parallax.system.SourceTextResource() {
      // jar:file:/Users/alfonso/.m2/repository/org/parallax3d/parallax/parallax/2.0-SNAPSHOT/parallax-2.0-SNAPSHOT.jar!/org/parallax3d/parallax/graphics/renderers/shaders/chunk/lights_lambert_vertex.glsl
      public String getText() {
        return "vLightFront = vec3( 0.0 );\n\n#ifdef DOUBLE_SIDED\n\n	vLightBack = vec3( 0.0 );\n\n#endif\n\ntransformedNormal = normalize( transformedNormal );\n\n#if MAX_DIR_LIGHTS > 0\n\nfor( int i = 0; i < MAX_DIR_LIGHTS; i ++ ) {\n\n	vec4 lDirection = viewMatrix * vec4( directionalLightDirection[ i ], 0.0 );\n	vec3 dirVector = normalize( lDirection.xyz );\n\n	float dotProduct = dot( transformedNormal, dirVector );\n	vec3 directionalLightWeighting = vec3( max( dotProduct, 0.0 ) );\n\n	#ifdef DOUBLE_SIDED\n\n		vec3 directionalLightWeightingBack = vec3( max( -dotProduct, 0.0 ) );\n\n		#ifdef WRAP_AROUND\n\n			vec3 directionalLightWeightingHalfBack = vec3( max( -0.5 * dotProduct + 0.5, 0.0 ) );\n\n		#endif\n\n	#endif\n\n	#ifdef WRAP_AROUND\n\n		vec3 directionalLightWeightingHalf = vec3( max( 0.5 * dotProduct + 0.5, 0.0 ) );\n		directionalLightWeighting = mix( directionalLightWeighting, directionalLightWeightingHalf, wrapRGB );\n\n		#ifdef DOUBLE_SIDED\n\n			directionalLightWeightingBack = mix( directionalLightWeightingBack, directionalLightWeightingHalfBack, wrapRGB );\n\n		#endif\n\n	#endif\n\n	vLightFront += directionalLightColor[ i ] * directionalLightWeighting;\n\n	#ifdef DOUBLE_SIDED\n\n		vLightBack += directionalLightColor[ i ] * directionalLightWeightingBack;\n\n	#endif\n\n}\n\n#endif\n\n#if MAX_POINT_LIGHTS > 0\n\n	for( int i = 0; i < MAX_POINT_LIGHTS; i ++ ) {\n\n		vec4 lPosition = viewMatrix * vec4( pointLightPosition[ i ], 1.0 );\n		vec3 lVector = lPosition.xyz - mvPosition.xyz;\n\n		float lDistance = 1.0;\n		if ( pointLightDistance[ i ] > 0.0 )\n			lDistance = 1.0 - min( ( length( lVector ) / pointLightDistance[ i ] ), 1.0 );\n\n		lVector = normalize( lVector );\n		float dotProduct = dot( transformedNormal, lVector );\n\n		vec3 pointLightWeighting = vec3( max( dotProduct, 0.0 ) );\n\n		#ifdef DOUBLE_SIDED\n\n			vec3 pointLightWeightingBack = vec3( max( -dotProduct, 0.0 ) );\n\n			#ifdef WRAP_AROUND\n\n				vec3 pointLightWeightingHalfBack = vec3( max( -0.5 * dotProduct + 0.5, 0.0 ) );\n\n			#endif\n\n		#endif\n\n		#ifdef WRAP_AROUND\n\n			vec3 pointLightWeightingHalf = vec3( max( 0.5 * dotProduct + 0.5, 0.0 ) );\n			pointLightWeighting = mix( pointLightWeighting, pointLightWeightingHalf, wrapRGB );\n\n			#ifdef DOUBLE_SIDED\n\n				pointLightWeightingBack = mix( pointLightWeightingBack, pointLightWeightingHalfBack, wrapRGB );\n\n			#endif\n\n		#endif\n\n		vLightFront += pointLightColor[ i ] * pointLightWeighting * lDistance;\n\n		#ifdef DOUBLE_SIDED\n\n			vLightBack += pointLightColor[ i ] * pointLightWeightingBack * lDistance;\n\n		#endif\n\n	}\n\n#endif\n\n#if MAX_SPOT_LIGHTS > 0\n\n	for( int i = 0; i < MAX_SPOT_LIGHTS; i ++ ) {\n\n		vec4 lPosition = viewMatrix * vec4( spotLightPosition[ i ], 1.0 );\n		vec3 lVector = lPosition.xyz - mvPosition.xyz;\n\n		float spotEffect = dot( spotLightDirection[ i ], normalize( spotLightPosition[ i ] - worldPosition.xyz ) );\n\n		if ( spotEffect > spotLightAngleCos[ i ] ) {\n\n			spotEffect = max( pow( max( spotEffect, 0.0 ), spotLightExponent[ i ] ), 0.0 );\n\n			float lDistance = 1.0;\n			if ( spotLightDistance[ i ] > 0.0 )\n				lDistance = 1.0 - min( ( length( lVector ) / spotLightDistance[ i ] ), 1.0 );\n\n			lVector = normalize( lVector );\n\n			float dotProduct = dot( transformedNormal, lVector );\n			vec3 spotLightWeighting = vec3( max( dotProduct, 0.0 ) );\n\n			#ifdef DOUBLE_SIDED\n\n				vec3 spotLightWeightingBack = vec3( max( -dotProduct, 0.0 ) );\n\n				#ifdef WRAP_AROUND\n\n					vec3 spotLightWeightingHalfBack = vec3( max( -0.5 * dotProduct + 0.5, 0.0 ) );\n\n				#endif\n\n			#endif\n\n			#ifdef WRAP_AROUND\n\n				vec3 spotLightWeightingHalf = vec3( max( 0.5 * dotProduct + 0.5, 0.0 ) );\n				spotLightWeighting = mix( spotLightWeighting, spotLightWeightingHalf, wrapRGB );\n\n				#ifdef DOUBLE_SIDED\n\n					spotLightWeightingBack = mix( spotLightWeightingBack, spotLightWeightingHalfBack, wrapRGB );\n\n				#endif\n\n			#endif\n\n			vLightFront += spotLightColor[ i ] * spotLightWeighting * lDistance * spotEffect;\n\n			#ifdef DOUBLE_SIDED\n\n				vLightBack += spotLightColor[ i ] * spotLightWeightingBack * lDistance * spotEffect;\n\n			#endif\n\n		}\n\n	}\n\n#endif\n\n#if MAX_HEMI_LIGHTS > 0\n\n	for( int i = 0; i < MAX_HEMI_LIGHTS; i ++ ) {\n\n		vec4 lDirection = viewMatrix * vec4( hemisphereLightDirection[ i ], 0.0 );\n		vec3 lVector = normalize( lDirection.xyz );\n\n		float dotProduct = dot( transformedNormal, lVector );\n\n		float hemiDiffuseWeight = 0.5 * dotProduct + 0.5;\n		float hemiDiffuseWeightBack = -0.5 * dotProduct + 0.5;\n\n		vLightFront += mix( hemisphereLightGroundColor[ i ], hemisphereLightSkyColor[ i ], hemiDiffuseWeight );\n\n		#ifdef DOUBLE_SIDED\n\n			vLightBack += mix( hemisphereLightGroundColor[ i ], hemisphereLightSkyColor[ i ], hemiDiffuseWeightBack );\n\n		#endif\n\n	}\n\n#endif\n\nvLightFront = vLightFront * diffuse + ambient * ambientLightColor + emissive;\n\n#ifdef DOUBLE_SIDED\n\n	vLightBack = vLightBack * diffuse + ambient * ambientLightColor + emissive;\n\n#endif";
      }
      public String getName() {
        return "getLightsLambertVertex";
      }
    }
    ;
  }
  private static class getLightsLambertVertexInitializer {
    static {
      _instance0.getLightsLambertVertexInitializer();
    }
    static org.parallax3d.parallax.system.SourceTextResource get() {
      return getLightsLambertVertex;
    }
  }
  public org.parallax3d.parallax.system.SourceTextResource getLightsLambertVertex() {
    return getLightsLambertVertexInitializer.get();
  }
  private void getLightsPhongFragmentInitializer() {
    getLightsPhongFragment = new org.parallax3d.parallax.system.SourceTextResource() {
      // jar:file:/Users/alfonso/.m2/repository/org/parallax3d/parallax/parallax/2.0-SNAPSHOT/parallax-2.0-SNAPSHOT.jar!/org/parallax3d/parallax/graphics/renderers/shaders/chunk/lights_phong_fragment.glsl
      public String getText() {
        return "vec3 normal = normalize( vNormal );\nvec3 viewPosition = normalize( vViewPosition );\n\n#ifdef DOUBLE_SIDED\n\n	normal = normal * ( -1.0 + 2.0 * float( gl_FrontFacing ) );\n\n#endif\n\n#ifdef USE_NORMALMAP\n\n	normal = perturbNormal2Arb( -vViewPosition, normal );\n\n#elif defined( USE_BUMPMAP )\n\n	normal = perturbNormalArb( -vViewPosition, normal, dHdxy_fwd() );\n\n#endif\n\n#if MAX_POINT_LIGHTS > 0\n\n	vec3 pointDiffuse = vec3( 0.0 );\n	vec3 pointSpecular = vec3( 0.0 );\n\n	for ( int i = 0; i < MAX_POINT_LIGHTS; i ++ ) {\n\n		vec4 lPosition = viewMatrix * vec4( pointLightPosition[ i ], 1.0 );\n		vec3 lVector = lPosition.xyz + vViewPosition.xyz;\n\n		float lDistance = 1.0;\n		if ( pointLightDistance[ i ] > 0.0 )\n			lDistance = 1.0 - min( ( length( lVector ) / pointLightDistance[ i ] ), 1.0 );\n\n		lVector = normalize( lVector );\n\n				// diffuse\n\n		float dotProduct = dot( normal, lVector );\n\n		#ifdef WRAP_AROUND\n\n			float pointDiffuseWeightFull = max( dotProduct, 0.0 );\n			float pointDiffuseWeightHalf = max( 0.5 * dotProduct + 0.5, 0.0 );\n\n			vec3 pointDiffuseWeight = mix( vec3( pointDiffuseWeightFull ), vec3( pointDiffuseWeightHalf ), wrapRGB );\n\n		#else\n\n			float pointDiffuseWeight = max( dotProduct, 0.0 );\n\n		#endif\n\n		pointDiffuse += diffuse * pointLightColor[ i ] * pointDiffuseWeight * lDistance;\n\n				// specular\n\n		vec3 pointHalfVector = normalize( lVector + viewPosition );\n		float pointDotNormalHalf = max( dot( normal, pointHalfVector ), 0.0 );\n		float pointSpecularWeight = specularStrength * max( pow( pointDotNormalHalf, shininess ), 0.0 );\n\n		float specularNormalization = ( shininess + 2.0 ) / 8.0;\n\n		vec3 schlick = specular + vec3( 1.0 - specular ) * pow( max( 1.0 - dot( lVector, pointHalfVector ), 0.0 ), 5.0 );\n		pointSpecular += schlick * pointLightColor[ i ] * pointSpecularWeight * pointDiffuseWeight * lDistance * specularNormalization;\n\n	}\n\n#endif\n\n#if MAX_SPOT_LIGHTS > 0\n\n	vec3 spotDiffuse = vec3( 0.0 );\n	vec3 spotSpecular = vec3( 0.0 );\n\n	for ( int i = 0; i < MAX_SPOT_LIGHTS; i ++ ) {\n\n		vec4 lPosition = viewMatrix * vec4( spotLightPosition[ i ], 1.0 );\n		vec3 lVector = lPosition.xyz + vViewPosition.xyz;\n\n		float lDistance = 1.0;\n		if ( spotLightDistance[ i ] > 0.0 )\n			lDistance = 1.0 - min( ( length( lVector ) / spotLightDistance[ i ] ), 1.0 );\n\n		lVector = normalize( lVector );\n\n		float spotEffect = dot( spotLightDirection[ i ], normalize( spotLightPosition[ i ] - vWorldPosition ) );\n\n		if ( spotEffect > spotLightAngleCos[ i ] ) {\n\n			spotEffect = max( pow( max( spotEffect, 0.0 ), spotLightExponent[ i ] ), 0.0 );\n\n					// diffuse\n\n			float dotProduct = dot( normal, lVector );\n\n			#ifdef WRAP_AROUND\n\n				float spotDiffuseWeightFull = max( dotProduct, 0.0 );\n				float spotDiffuseWeightHalf = max( 0.5 * dotProduct + 0.5, 0.0 );\n\n				vec3 spotDiffuseWeight = mix( vec3( spotDiffuseWeightFull ), vec3( spotDiffuseWeightHalf ), wrapRGB );\n\n			#else\n\n				float spotDiffuseWeight = max( dotProduct, 0.0 );\n\n			#endif\n\n			spotDiffuse += diffuse * spotLightColor[ i ] * spotDiffuseWeight * lDistance * spotEffect;\n\n					// specular\n\n			vec3 spotHalfVector = normalize( lVector + viewPosition );\n			float spotDotNormalHalf = max( dot( normal, spotHalfVector ), 0.0 );\n			float spotSpecularWeight = specularStrength * max( pow( spotDotNormalHalf, shininess ), 0.0 );\n\n			float specularNormalization = ( shininess + 2.0 ) / 8.0;\n\n			vec3 schlick = specular + vec3( 1.0 - specular ) * pow( max( 1.0 - dot( lVector, spotHalfVector ), 0.0 ), 5.0 );\n			spotSpecular += schlick * spotLightColor[ i ] * spotSpecularWeight * spotDiffuseWeight * lDistance * specularNormalization * spotEffect;\n\n		}\n\n	}\n\n#endif\n\n#if MAX_DIR_LIGHTS > 0\n\n	vec3 dirDiffuse = vec3( 0.0 );\n	vec3 dirSpecular = vec3( 0.0 );\n\n	for( int i = 0; i < MAX_DIR_LIGHTS; i ++ ) {\n\n		vec4 lDirection = viewMatrix * vec4( directionalLightDirection[ i ], 0.0 );\n		vec3 dirVector = normalize( lDirection.xyz );\n\n				// diffuse\n\n		float dotProduct = dot( normal, dirVector );\n\n		#ifdef WRAP_AROUND\n\n			float dirDiffuseWeightFull = max( dotProduct, 0.0 );\n			float dirDiffuseWeightHalf = max( 0.5 * dotProduct + 0.5, 0.0 );\n\n			vec3 dirDiffuseWeight = mix( vec3( dirDiffuseWeightFull ), vec3( dirDiffuseWeightHalf ), wrapRGB );\n\n		#else\n\n			float dirDiffuseWeight = max( dotProduct, 0.0 );\n\n		#endif\n\n		dirDiffuse += diffuse * directionalLightColor[ i ] * dirDiffuseWeight;\n\n		// specular\n\n		vec3 dirHalfVector = normalize( dirVector + viewPosition );\n		float dirDotNormalHalf = max( dot( normal, dirHalfVector ), 0.0 );\n		float dirSpecularWeight = specularStrength * max( pow( dirDotNormalHalf, shininess ), 0.0 );\n\n		/*\n		// fresnel term from skin shader\n		const float F0 = 0.128;\n\n		float base = 1.0 - dot( viewPosition, dirHalfVector );\n		float exponential = pow( base, 5.0 );\n\n		float fresnel = exponential + F0 * ( 1.0 - exponential );\n		*/\n\n		/*\n		// fresnel term from fresnel shader\n		const float mFresnelBias = 0.08;\n		const float mFresnelScale = 0.3;\n		const float mFresnelPower = 5.0;\n\n		float fresnel = mFresnelBias + mFresnelScale * pow( 1.0 + dot( normalize( -viewPosition ), normal ), mFresnelPower );\n		*/\n\n		float specularNormalization = ( shininess + 2.0 ) / 8.0;\n\n		// 		dirSpecular += specular * directionalLightColor[ i ] * dirSpecularWeight * dirDiffuseWeight * specularNormalization * fresnel;\n\n		vec3 schlick = specular + vec3( 1.0 - specular ) * pow( max( 1.0 - dot( dirVector, dirHalfVector ), 0.0 ), 5.0 );\n		dirSpecular += schlick * directionalLightColor[ i ] * dirSpecularWeight * dirDiffuseWeight * specularNormalization;\n\n\n	}\n\n#endif\n\n#if MAX_HEMI_LIGHTS > 0\n\n	vec3 hemiDiffuse = vec3( 0.0 );\n	vec3 hemiSpecular = vec3( 0.0 );\n\n	for( int i = 0; i < MAX_HEMI_LIGHTS; i ++ ) {\n\n		vec4 lDirection = viewMatrix * vec4( hemisphereLightDirection[ i ], 0.0 );\n		vec3 lVector = normalize( lDirection.xyz );\n\n		// diffuse\n\n		float dotProduct = dot( normal, lVector );\n		float hemiDiffuseWeight = 0.5 * dotProduct + 0.5;\n\n		vec3 hemiColor = mix( hemisphereLightGroundColor[ i ], hemisphereLightSkyColor[ i ], hemiDiffuseWeight );\n\n		hemiDiffuse += diffuse * hemiColor;\n\n		// specular (sky light)\n\n		vec3 hemiHalfVectorSky = normalize( lVector + viewPosition );\n		float hemiDotNormalHalfSky = 0.5 * dot( normal, hemiHalfVectorSky ) + 0.5;\n		float hemiSpecularWeightSky = specularStrength * max( pow( max( hemiDotNormalHalfSky, 0.0 ), shininess ), 0.0 );\n\n		// specular (ground light)\n\n		vec3 lVectorGround = -lVector;\n\n		vec3 hemiHalfVectorGround = normalize( lVectorGround + viewPosition );\n		float hemiDotNormalHalfGround = 0.5 * dot( normal, hemiHalfVectorGround ) + 0.5;\n		float hemiSpecularWeightGround = specularStrength * max( pow( max( hemiDotNormalHalfGround, 0.0 ), shininess ), 0.0 );\n\n		float dotProductGround = dot( normal, lVectorGround );\n\n		float specularNormalization = ( shininess + 2.0 ) / 8.0;\n\n		vec3 schlickSky = specular + vec3( 1.0 - specular ) * pow( max( 1.0 - dot( lVector, hemiHalfVectorSky ), 0.0 ), 5.0 );\n		vec3 schlickGround = specular + vec3( 1.0 - specular ) * pow( max( 1.0 - dot( lVectorGround, hemiHalfVectorGround ), 0.0 ), 5.0 );\n		hemiSpecular += hemiColor * specularNormalization * ( schlickSky * hemiSpecularWeightSky * max( dotProduct, 0.0 ) + schlickGround * hemiSpecularWeightGround * max( dotProductGround, 0.0 ) );\n\n	}\n\n#endif\n\nvec3 totalDiffuse = vec3( 0.0 );\nvec3 totalSpecular = vec3( 0.0 );\n\n#if MAX_DIR_LIGHTS > 0\n\n	totalDiffuse += dirDiffuse;\n	totalSpecular += dirSpecular;\n\n#endif\n\n#if MAX_HEMI_LIGHTS > 0\n\n	totalDiffuse += hemiDiffuse;\n	totalSpecular += hemiSpecular;\n\n#endif\n\n#if MAX_POINT_LIGHTS > 0\n\n	totalDiffuse += pointDiffuse;\n	totalSpecular += pointSpecular;\n\n#endif\n\n#if MAX_SPOT_LIGHTS > 0\n\n	totalDiffuse += spotDiffuse;\n	totalSpecular += spotSpecular;\n\n#endif\n\n#ifdef METAL\n\n	gl_FragColor.xyz = gl_FragColor.xyz * ( emissive + totalDiffuse + ambientLightColor * ambient + totalSpecular );\n\n#else\n\n	gl_FragColor.xyz = gl_FragColor.xyz * ( emissive + totalDiffuse + ambientLightColor * ambient ) + totalSpecular;\n\n#endif";
      }
      public String getName() {
        return "getLightsPhongFragment";
      }
    }
    ;
  }
  private static class getLightsPhongFragmentInitializer {
    static {
      _instance0.getLightsPhongFragmentInitializer();
    }
    static org.parallax3d.parallax.system.SourceTextResource get() {
      return getLightsPhongFragment;
    }
  }
  public org.parallax3d.parallax.system.SourceTextResource getLightsPhongFragment() {
    return getLightsPhongFragmentInitializer.get();
  }
  private void getLightsPhongParsFragmentInitializer() {
    getLightsPhongParsFragment = new org.parallax3d.parallax.system.SourceTextResource() {
      // jar:file:/Users/alfonso/.m2/repository/org/parallax3d/parallax/parallax/2.0-SNAPSHOT/parallax-2.0-SNAPSHOT.jar!/org/parallax3d/parallax/graphics/renderers/shaders/chunk/lights_phong_pars_fragment.glsl
      public String getText() {
        return "uniform vec3 ambientLightColor;\n\n#if MAX_DIR_LIGHTS > 0\n\n	uniform vec3 directionalLightColor[ MAX_DIR_LIGHTS ];\n	uniform vec3 directionalLightDirection[ MAX_DIR_LIGHTS ];\n\n#endif\n\n#if MAX_HEMI_LIGHTS > 0\n\n	uniform vec3 hemisphereLightSkyColor[ MAX_HEMI_LIGHTS ];\n	uniform vec3 hemisphereLightGroundColor[ MAX_HEMI_LIGHTS ];\n	uniform vec3 hemisphereLightDirection[ MAX_HEMI_LIGHTS ];\n\n#endif\n\n#if MAX_POINT_LIGHTS > 0\n\n	uniform vec3 pointLightColor[ MAX_POINT_LIGHTS ];\n\n	uniform vec3 pointLightPosition[ MAX_POINT_LIGHTS ];\n	uniform float pointLightDistance[ MAX_POINT_LIGHTS ];\n\n#endif\n\n#if MAX_SPOT_LIGHTS > 0\n\n	uniform vec3 spotLightColor[ MAX_SPOT_LIGHTS ];\n	uniform vec3 spotLightPosition[ MAX_SPOT_LIGHTS ];\n	uniform vec3 spotLightDirection[ MAX_SPOT_LIGHTS ];\n	uniform float spotLightAngleCos[ MAX_SPOT_LIGHTS ];\n	uniform float spotLightExponent[ MAX_SPOT_LIGHTS ];\n\n	uniform float spotLightDistance[ MAX_SPOT_LIGHTS ];\n\n#endif\n\n#if MAX_SPOT_LIGHTS > 0 || defined( USE_BUMPMAP ) || defined( USE_ENVMAP )\n\n	varying vec3 vWorldPosition;\n\n#endif\n\n#ifdef WRAP_AROUND\n\n	uniform vec3 wrapRGB;\n\n#endif\n\nvarying vec3 vViewPosition;\nvarying vec3 vNormal;";
      }
      public String getName() {
        return "getLightsPhongParsFragment";
      }
    }
    ;
  }
  private static class getLightsPhongParsFragmentInitializer {
    static {
      _instance0.getLightsPhongParsFragmentInitializer();
    }
    static org.parallax3d.parallax.system.SourceTextResource get() {
      return getLightsPhongParsFragment;
    }
  }
  public org.parallax3d.parallax.system.SourceTextResource getLightsPhongParsFragment() {
    return getLightsPhongParsFragmentInitializer.get();
  }
  private void getLightsPhongParsVertexInitializer() {
    getLightsPhongParsVertex = new org.parallax3d.parallax.system.SourceTextResource() {
      // jar:file:/Users/alfonso/.m2/repository/org/parallax3d/parallax/parallax/2.0-SNAPSHOT/parallax-2.0-SNAPSHOT.jar!/org/parallax3d/parallax/graphics/renderers/shaders/chunk/lights_phong_pars_vertex.glsl
      public String getText() {
        return "#if MAX_SPOT_LIGHTS > 0 || defined( USE_BUMPMAP ) || defined( USE_ENVMAP )\n\n	varying vec3 vWorldPosition;\n\n#endif\n";
      }
      public String getName() {
        return "getLightsPhongParsVertex";
      }
    }
    ;
  }
  private static class getLightsPhongParsVertexInitializer {
    static {
      _instance0.getLightsPhongParsVertexInitializer();
    }
    static org.parallax3d.parallax.system.SourceTextResource get() {
      return getLightsPhongParsVertex;
    }
  }
  public org.parallax3d.parallax.system.SourceTextResource getLightsPhongParsVertex() {
    return getLightsPhongParsVertexInitializer.get();
  }
  private void getLightsPhongVertexInitializer() {
    getLightsPhongVertex = new org.parallax3d.parallax.system.SourceTextResource() {
      // jar:file:/Users/alfonso/.m2/repository/org/parallax3d/parallax/parallax/2.0-SNAPSHOT/parallax-2.0-SNAPSHOT.jar!/org/parallax3d/parallax/graphics/renderers/shaders/chunk/lights_phong_vertex.glsl
      public String getText() {
        return "#if MAX_SPOT_LIGHTS > 0 || defined( USE_BUMPMAP ) || defined( USE_ENVMAP )\n\n	vWorldPosition = worldPosition.xyz;\n\n#endif";
      }
      public String getName() {
        return "getLightsPhongVertex";
      }
    }
    ;
  }
  private static class getLightsPhongVertexInitializer {
    static {
      _instance0.getLightsPhongVertexInitializer();
    }
    static org.parallax3d.parallax.system.SourceTextResource get() {
      return getLightsPhongVertex;
    }
  }
  public org.parallax3d.parallax.system.SourceTextResource getLightsPhongVertex() {
    return getLightsPhongVertexInitializer.get();
  }
  private void getLinearToGammaFragmentInitializer() {
    getLinearToGammaFragment = new org.parallax3d.parallax.system.SourceTextResource() {
      // jar:file:/Users/alfonso/.m2/repository/org/parallax3d/parallax/parallax/2.0-SNAPSHOT/parallax-2.0-SNAPSHOT.jar!/org/parallax3d/parallax/graphics/renderers/shaders/chunk/linear_to_gamma_fragment.glsl
      public String getText() {
        return "#ifdef GAMMA_OUTPUT\n\n	gl_FragColor.xyz = sqrt( gl_FragColor.xyz );\n\n#endif";
      }
      public String getName() {
        return "getLinearToGammaFragment";
      }
    }
    ;
  }
  private static class getLinearToGammaFragmentInitializer {
    static {
      _instance0.getLinearToGammaFragmentInitializer();
    }
    static org.parallax3d.parallax.system.SourceTextResource get() {
      return getLinearToGammaFragment;
    }
  }
  public org.parallax3d.parallax.system.SourceTextResource getLinearToGammaFragment() {
    return getLinearToGammaFragmentInitializer.get();
  }
  private void getLogdepthbufFragmentInitializer() {
    getLogdepthbufFragment = new org.parallax3d.parallax.system.SourceTextResource() {
      // jar:file:/Users/alfonso/.m2/repository/org/parallax3d/parallax/parallax/2.0-SNAPSHOT/parallax-2.0-SNAPSHOT.jar!/org/parallax3d/parallax/graphics/renderers/shaders/chunk/logdepthbuf_fragment.glsl
      public String getText() {
        return "#if defined(USE_LOGDEPTHBUF) && defined(USE_LOGDEPTHBUF_EXT)\r\n\r\n	gl_FragDepthEXT = log2(vFragDepth) * logDepthBufFC * 0.5;\r\n\r\n#endif";
      }
      public String getName() {
        return "getLogdepthbufFragment";
      }
    }
    ;
  }
  private static class getLogdepthbufFragmentInitializer {
    static {
      _instance0.getLogdepthbufFragmentInitializer();
    }
    static org.parallax3d.parallax.system.SourceTextResource get() {
      return getLogdepthbufFragment;
    }
  }
  public org.parallax3d.parallax.system.SourceTextResource getLogdepthbufFragment() {
    return getLogdepthbufFragmentInitializer.get();
  }
  private void getLogdepthbufParFragmentInitializer() {
    getLogdepthbufParFragment = new org.parallax3d.parallax.system.SourceTextResource() {
      // jar:file:/Users/alfonso/.m2/repository/org/parallax3d/parallax/parallax/2.0-SNAPSHOT/parallax-2.0-SNAPSHOT.jar!/org/parallax3d/parallax/graphics/renderers/shaders/chunk/logdepthbuf_par_fragment.glsl
      public String getText() {
        return "#ifdef USE_LOGDEPTHBUF\n\n	uniform float logDepthBufFC;\n\n	#ifdef USE_LOGDEPTHBUF_EXT\n\n		varying float vFragDepth;\n\n	#endif\n\n#endif\n";
      }
      public String getName() {
        return "getLogdepthbufParFragment";
      }
    }
    ;
  }
  private static class getLogdepthbufParFragmentInitializer {
    static {
      _instance0.getLogdepthbufParFragmentInitializer();
    }
    static org.parallax3d.parallax.system.SourceTextResource get() {
      return getLogdepthbufParFragment;
    }
  }
  public org.parallax3d.parallax.system.SourceTextResource getLogdepthbufParFragment() {
    return getLogdepthbufParFragmentInitializer.get();
  }
  private void getLogdepthbufParVertexInitializer() {
    getLogdepthbufParVertex = new org.parallax3d.parallax.system.SourceTextResource() {
      // jar:file:/Users/alfonso/.m2/repository/org/parallax3d/parallax/parallax/2.0-SNAPSHOT/parallax-2.0-SNAPSHOT.jar!/org/parallax3d/parallax/graphics/renderers/shaders/chunk/logdepthbuf_par_vertex.glsl
      public String getText() {
        return "#ifdef USE_LOGDEPTHBUF\n\n	#ifdef USE_LOGDEPTHBUF_EXT\n\n		varying float vFragDepth;\n\n	#endif\n\n	uniform float logDepthBufFC;\n\n#endif";
      }
      public String getName() {
        return "getLogdepthbufParVertex";
      }
    }
    ;
  }
  private static class getLogdepthbufParVertexInitializer {
    static {
      _instance0.getLogdepthbufParVertexInitializer();
    }
    static org.parallax3d.parallax.system.SourceTextResource get() {
      return getLogdepthbufParVertex;
    }
  }
  public org.parallax3d.parallax.system.SourceTextResource getLogdepthbufParVertex() {
    return getLogdepthbufParVertexInitializer.get();
  }
  private void getLogdepthbufVertexInitializer() {
    getLogdepthbufVertex = new org.parallax3d.parallax.system.SourceTextResource() {
      // jar:file:/Users/alfonso/.m2/repository/org/parallax3d/parallax/parallax/2.0-SNAPSHOT/parallax-2.0-SNAPSHOT.jar!/org/parallax3d/parallax/graphics/renderers/shaders/chunk/logdepthbuf_vertex.glsl
      public String getText() {
        return "#ifdef USE_LOGDEPTHBUF\n\n	gl_Position.z = log2(max(1e-6, gl_Position.w + 1.0)) * logDepthBufFC;\n\n	#ifdef USE_LOGDEPTHBUF_EXT\n\n		vFragDepth = 1.0 + gl_Position.w;\n\n#else\n\n		gl_Position.z = (gl_Position.z - 1.0) * gl_Position.w;\n\n	#endif\n\n#endif";
      }
      public String getName() {
        return "getLogdepthbufVertex";
      }
    }
    ;
  }
  private static class getLogdepthbufVertexInitializer {
    static {
      _instance0.getLogdepthbufVertexInitializer();
    }
    static org.parallax3d.parallax.system.SourceTextResource get() {
      return getLogdepthbufVertex;
    }
  }
  public org.parallax3d.parallax.system.SourceTextResource getLogdepthbufVertex() {
    return getLogdepthbufVertexInitializer.get();
  }
  private void getMapFragmentInitializer() {
    getMapFragment = new org.parallax3d.parallax.system.SourceTextResource() {
      // jar:file:/Users/alfonso/.m2/repository/org/parallax3d/parallax/parallax/2.0-SNAPSHOT/parallax-2.0-SNAPSHOT.jar!/org/parallax3d/parallax/graphics/renderers/shaders/chunk/map_fragment.glsl
      public String getText() {
        return "#ifdef USE_MAP\n\n	vec4 texelColor = texture2D( map, vUv );\n\n	#ifdef GAMMA_INPUT\n\n		texelColor.xyz *= texelColor.xyz;\n\n	#endif\n\n	gl_FragColor = gl_FragColor * texelColor;\n\n#endif";
      }
      public String getName() {
        return "getMapFragment";
      }
    }
    ;
  }
  private static class getMapFragmentInitializer {
    static {
      _instance0.getMapFragmentInitializer();
    }
    static org.parallax3d.parallax.system.SourceTextResource get() {
      return getMapFragment;
    }
  }
  public org.parallax3d.parallax.system.SourceTextResource getMapFragment() {
    return getMapFragmentInitializer.get();
  }
  private void getMapParsFragmentInitializer() {
    getMapParsFragment = new org.parallax3d.parallax.system.SourceTextResource() {
      // jar:file:/Users/alfonso/.m2/repository/org/parallax3d/parallax/parallax/2.0-SNAPSHOT/parallax-2.0-SNAPSHOT.jar!/org/parallax3d/parallax/graphics/renderers/shaders/chunk/map_pars_fragment.glsl
      public String getText() {
        return "#if defined( USE_MAP ) || defined( USE_BUMPMAP ) || defined( USE_NORMALMAP ) || defined( USE_SPECULARMAP ) || defined( USE_ALPHAMAP )\n\n	varying vec2 vUv;\n\n#endif\n\n#ifdef USE_MAP\n\n	uniform sampler2D map;\n\n#endif";
      }
      public String getName() {
        return "getMapParsFragment";
      }
    }
    ;
  }
  private static class getMapParsFragmentInitializer {
    static {
      _instance0.getMapParsFragmentInitializer();
    }
    static org.parallax3d.parallax.system.SourceTextResource get() {
      return getMapParsFragment;
    }
  }
  public org.parallax3d.parallax.system.SourceTextResource getMapParsFragment() {
    return getMapParsFragmentInitializer.get();
  }
  private void getMapParsVertexInitializer() {
    getMapParsVertex = new org.parallax3d.parallax.system.SourceTextResource() {
      // jar:file:/Users/alfonso/.m2/repository/org/parallax3d/parallax/parallax/2.0-SNAPSHOT/parallax-2.0-SNAPSHOT.jar!/org/parallax3d/parallax/graphics/renderers/shaders/chunk/map_pars_vertex.glsl
      public String getText() {
        return "#if defined( USE_MAP ) || defined( USE_BUMPMAP ) || defined( USE_NORMALMAP ) || defined( USE_SPECULARMAP ) || defined( USE_ALPHAMAP )\n\n	varying vec2 vUv;\n	uniform vec4 offsetRepeat;\n\n#endif\n";
      }
      public String getName() {
        return "getMapParsVertex";
      }
    }
    ;
  }
  private static class getMapParsVertexInitializer {
    static {
      _instance0.getMapParsVertexInitializer();
    }
    static org.parallax3d.parallax.system.SourceTextResource get() {
      return getMapParsVertex;
    }
  }
  public org.parallax3d.parallax.system.SourceTextResource getMapParsVertex() {
    return getMapParsVertexInitializer.get();
  }
  private void getMapParticleFragmentInitializer() {
    getMapParticleFragment = new org.parallax3d.parallax.system.SourceTextResource() {
      // jar:file:/Users/alfonso/.m2/repository/org/parallax3d/parallax/parallax/2.0-SNAPSHOT/parallax-2.0-SNAPSHOT.jar!/org/parallax3d/parallax/graphics/renderers/shaders/chunk/map_particle_fragment.glsl
      public String getText() {
        return "#ifdef USE_MAP\n\n	gl_FragColor = gl_FragColor * texture2D( map, vec2( gl_PointCoord.x, 1.0 - gl_PointCoord.y ) );\n\n#endif";
      }
      public String getName() {
        return "getMapParticleFragment";
      }
    }
    ;
  }
  private static class getMapParticleFragmentInitializer {
    static {
      _instance0.getMapParticleFragmentInitializer();
    }
    static org.parallax3d.parallax.system.SourceTextResource get() {
      return getMapParticleFragment;
    }
  }
  public org.parallax3d.parallax.system.SourceTextResource getMapParticleFragment() {
    return getMapParticleFragmentInitializer.get();
  }
  private void getMapParticleParsFragmentInitializer() {
    getMapParticleParsFragment = new org.parallax3d.parallax.system.SourceTextResource() {
      // jar:file:/Users/alfonso/.m2/repository/org/parallax3d/parallax/parallax/2.0-SNAPSHOT/parallax-2.0-SNAPSHOT.jar!/org/parallax3d/parallax/graphics/renderers/shaders/chunk/map_particle_pars_fragment.glsl
      public String getText() {
        return "#ifdef USE_MAP\n\n	uniform sampler2D map;\n\n#endif";
      }
      public String getName() {
        return "getMapParticleParsFragment";
      }
    }
    ;
  }
  private static class getMapParticleParsFragmentInitializer {
    static {
      _instance0.getMapParticleParsFragmentInitializer();
    }
    static org.parallax3d.parallax.system.SourceTextResource get() {
      return getMapParticleParsFragment;
    }
  }
  public org.parallax3d.parallax.system.SourceTextResource getMapParticleParsFragment() {
    return getMapParticleParsFragmentInitializer.get();
  }
  private void getMapVertexInitializer() {
    getMapVertex = new org.parallax3d.parallax.system.SourceTextResource() {
      // jar:file:/Users/alfonso/.m2/repository/org/parallax3d/parallax/parallax/2.0-SNAPSHOT/parallax-2.0-SNAPSHOT.jar!/org/parallax3d/parallax/graphics/renderers/shaders/chunk/map_vertex.glsl
      public String getText() {
        return "#if defined( USE_MAP ) || defined( USE_BUMPMAP ) || defined( USE_NORMALMAP ) || defined( USE_SPECULARMAP ) || defined( USE_ALPHAMAP )\n\n	vUv = uv * offsetRepeat.zw + offsetRepeat.xy;\n\n#endif";
      }
      public String getName() {
        return "getMapVertex";
      }
    }
    ;
  }
  private static class getMapVertexInitializer {
    static {
      _instance0.getMapVertexInitializer();
    }
    static org.parallax3d.parallax.system.SourceTextResource get() {
      return getMapVertex;
    }
  }
  public org.parallax3d.parallax.system.SourceTextResource getMapVertex() {
    return getMapVertexInitializer.get();
  }
  private void getMorphnormalVertexInitializer() {
    getMorphnormalVertex = new org.parallax3d.parallax.system.SourceTextResource() {
      // jar:file:/Users/alfonso/.m2/repository/org/parallax3d/parallax/parallax/2.0-SNAPSHOT/parallax-2.0-SNAPSHOT.jar!/org/parallax3d/parallax/graphics/renderers/shaders/chunk/morphnormal_vertex.glsl
      public String getText() {
        return "#ifdef USE_MORPHNORMALS\n\n	vec3 morphedNormal = vec3( 0.0 );\n\n	morphedNormal += ( morphNormal0 - normal ) * morphTargetInfluences[ 0 ];\n	morphedNormal += ( morphNormal1 - normal ) * morphTargetInfluences[ 1 ];\n	morphedNormal += ( morphNormal2 - normal ) * morphTargetInfluences[ 2 ];\n	morphedNormal += ( morphNormal3 - normal ) * morphTargetInfluences[ 3 ];\n\n	morphedNormal += normal;\n\n#endif";
      }
      public String getName() {
        return "getMorphnormalVertex";
      }
    }
    ;
  }
  private static class getMorphnormalVertexInitializer {
    static {
      _instance0.getMorphnormalVertexInitializer();
    }
    static org.parallax3d.parallax.system.SourceTextResource get() {
      return getMorphnormalVertex;
    }
  }
  public org.parallax3d.parallax.system.SourceTextResource getMorphnormalVertex() {
    return getMorphnormalVertexInitializer.get();
  }
  private void getMorphtargetParsVertexInitializer() {
    getMorphtargetParsVertex = new org.parallax3d.parallax.system.SourceTextResource() {
      // jar:file:/Users/alfonso/.m2/repository/org/parallax3d/parallax/parallax/2.0-SNAPSHOT/parallax-2.0-SNAPSHOT.jar!/org/parallax3d/parallax/graphics/renderers/shaders/chunk/morphtarget_pars_vertex.glsl
      public String getText() {
        return "#ifdef USE_MORPHTARGETS\r\n\r\n	#ifndef USE_MORPHNORMALS\r\n\r\n	uniform float morphTargetInfluences[ 8 ];\r\n\r\n	#else\r\n\r\n	uniform float morphTargetInfluences[ 4 ];\r\n\r\n	#endif\r\n\r\n#endif";
      }
      public String getName() {
        return "getMorphtargetParsVertex";
      }
    }
    ;
  }
  private static class getMorphtargetParsVertexInitializer {
    static {
      _instance0.getMorphtargetParsVertexInitializer();
    }
    static org.parallax3d.parallax.system.SourceTextResource get() {
      return getMorphtargetParsVertex;
    }
  }
  public org.parallax3d.parallax.system.SourceTextResource getMorphtargetParsVertex() {
    return getMorphtargetParsVertexInitializer.get();
  }
  private void getMorphtargetVertexInitializer() {
    getMorphtargetVertex = new org.parallax3d.parallax.system.SourceTextResource() {
      // jar:file:/Users/alfonso/.m2/repository/org/parallax3d/parallax/parallax/2.0-SNAPSHOT/parallax-2.0-SNAPSHOT.jar!/org/parallax3d/parallax/graphics/renderers/shaders/chunk/morphtarget_vertex.glsl
      public String getText() {
        return "#ifdef USE_MORPHTARGETS\n\n	vec3 morphed = vec3( 0.0 );\n	morphed += ( morphTarget0 - position ) * morphTargetInfluences[ 0 ];\n	morphed += ( morphTarget1 - position ) * morphTargetInfluences[ 1 ];\n	morphed += ( morphTarget2 - position ) * morphTargetInfluences[ 2 ];\n	morphed += ( morphTarget3 - position ) * morphTargetInfluences[ 3 ];\n\n	#ifndef USE_MORPHNORMALS\n\n	morphed += ( morphTarget4 - position ) * morphTargetInfluences[ 4 ];\n	morphed += ( morphTarget5 - position ) * morphTargetInfluences[ 5 ];\n	morphed += ( morphTarget6 - position ) * morphTargetInfluences[ 6 ];\n	morphed += ( morphTarget7 - position ) * morphTargetInfluences[ 7 ];\n\n	#endif\n\n	morphed += position;\n\n#endif";
      }
      public String getName() {
        return "getMorphtargetVertex";
      }
    }
    ;
  }
  private static class getMorphtargetVertexInitializer {
    static {
      _instance0.getMorphtargetVertexInitializer();
    }
    static org.parallax3d.parallax.system.SourceTextResource get() {
      return getMorphtargetVertex;
    }
  }
  public org.parallax3d.parallax.system.SourceTextResource getMorphtargetVertex() {
    return getMorphtargetVertexInitializer.get();
  }
  private void getNormalmapParsFragmentInitializer() {
    getNormalmapParsFragment = new org.parallax3d.parallax.system.SourceTextResource() {
      // jar:file:/Users/alfonso/.m2/repository/org/parallax3d/parallax/parallax/2.0-SNAPSHOT/parallax-2.0-SNAPSHOT.jar!/org/parallax3d/parallax/graphics/renderers/shaders/chunk/normalmap_pars_fragment.glsl
      public String getText() {
        return "#ifdef USE_NORMALMAP\n\n	uniform sampler2D normalMap;\n	uniform vec2 normalScale;\n\n			// Per-Pixel Tangent Space Normal Mapping\n			// http://hacksoflife.blogspot.ch/2009/11/per-pixel-tangent-space-normal-mapping.html\n\n	vec3 perturbNormal2Arb( vec3 eye_pos, vec3 surf_norm ) {\n\n		vec3 q0 = dFdx( eye_pos.xyz );\n		vec3 q1 = dFdy( eye_pos.xyz );\n		vec2 st0 = dFdx( vUv.st );\n		vec2 st1 = dFdy( vUv.st );\n\n		vec3 S = normalize( q0 * st1.t - q1 * st0.t );\n		vec3 T = normalize( -q0 * st1.s + q1 * st0.s );\n		vec3 N = normalize( surf_norm );\n\n		vec3 mapN = texture2D( normalMap, vUv ).xyz * 2.0 - 1.0;\n		mapN.xy = normalScale * mapN.xy;\n		mat3 tsn = mat3( S, T, N );\n		return normalize( tsn * mapN );\n\n	}\n\n#endif\n";
      }
      public String getName() {
        return "getNormalmapParsFragment";
      }
    }
    ;
  }
  private static class getNormalmapParsFragmentInitializer {
    static {
      _instance0.getNormalmapParsFragmentInitializer();
    }
    static org.parallax3d.parallax.system.SourceTextResource get() {
      return getNormalmapParsFragment;
    }
  }
  public org.parallax3d.parallax.system.SourceTextResource getNormalmapParsFragment() {
    return getNormalmapParsFragmentInitializer.get();
  }
  private void getShadowmapFragmentInitializer() {
    getShadowmapFragment = new org.parallax3d.parallax.system.SourceTextResource() {
      // jar:file:/Users/alfonso/.m2/repository/org/parallax3d/parallax/parallax/2.0-SNAPSHOT/parallax-2.0-SNAPSHOT.jar!/org/parallax3d/parallax/graphics/renderers/shaders/chunk/shadowmap_fragment.glsl
      public String getText() {
        return "#ifdef USE_SHADOWMAP\n\n	#ifdef SHADOWMAP_DEBUG\n\n		vec3 frustumColors[3];\n		frustumColors[0] = vec3( 1.0, 0.5, 0.0 );\n		frustumColors[1] = vec3( 0.0, 1.0, 0.8 );\n		frustumColors[2] = vec3( 0.0, 0.5, 1.0 );\n\n	#endif\n\n	#ifdef SHADOWMAP_CASCADE\n\n		int inFrustumCount = 0;\n\n	#endif\n\n	float fDepth;\n	vec3 shadowColor = vec3( 1.0 );\n\n	for( int i = 0; i < MAX_SHADOWS; i ++ ) {\n\n		vec3 shadowCoord = vShadowCoord[ i ].xyz / vShadowCoord[ i ].w;\n\n				// if ( something && something ) breaks ATI OpenGL shader compiler\n				// if ( all( something, something ) ) using this instead\n\n		bvec4 inFrustumVec = bvec4 ( shadowCoord.x >= 0.0, shadowCoord.x <= 1.0, shadowCoord.y >= 0.0, shadowCoord.y <= 1.0 );\n		bool inFrustum = all( inFrustumVec );\n\n				// don't shadow pixels outside of light frustum\n				// use just first frustum (for cascades)\n				// don't shadow pixels behind far plane of light frustum\n\n		#ifdef SHADOWMAP_CASCADE\n\n			inFrustumCount += int( inFrustum );\n			bvec3 frustumTestVec = bvec3( inFrustum, inFrustumCount == 1, shadowCoord.z <= 1.0 );\n\n		#else\n\n			bvec2 frustumTestVec = bvec2( inFrustum, shadowCoord.z <= 1.0 );\n\n		#endif\n\n		bool frustumTest = all( frustumTestVec );\n\n		if ( frustumTest ) {\n\n			shadowCoord.z += shadowBias[ i ];\n\n			#if defined( SHADOWMAP_TYPE_PCF )\n\n						// Percentage-close filtering\n						// (9 pixel kernel)\n						// http://fabiensanglard.net/shadowmappingPCF/\n\n				float shadow = 0.0;\n\n		/*\n						// nested loops breaks shader compiler / validator on some ATI cards when using OpenGL\n						// must enroll loop manually\n\n				for ( float y = -1.25; y <= 1.25; y += 1.25 )\n					for ( float x = -1.25; x <= 1.25; x += 1.25 ) {\n\n						vec4 rgbaDepth = texture2D( shadowMap[ i ], vec2( x * xPixelOffset, y * yPixelOffset ) + shadowCoord.xy );\n\n								// doesn't seem to produce any noticeable visual difference compared to simple texture2D lookup\n								//vec4 rgbaDepth = texture2DProj( shadowMap[ i ], vec4( vShadowCoord[ i ].w * ( vec2( x * xPixelOffset, y * yPixelOffset ) + shadowCoord.xy ), 0.05, vShadowCoord[ i ].w ) );\n\n						float fDepth = unpackDepth( rgbaDepth );\n\n						if ( fDepth < shadowCoord.z )\n							shadow += 1.0;\n\n				}\n\n				shadow /= 9.0;\n\n		*/\n\n				const float shadowDelta = 1.0 / 9.0;\n\n				float xPixelOffset = 1.0 / shadowMapSize[ i ].x;\n				float yPixelOffset = 1.0 / shadowMapSize[ i ].y;\n\n				float dx0 = -1.25 * xPixelOffset;\n				float dy0 = -1.25 * yPixelOffset;\n				float dx1 = 1.25 * xPixelOffset;\n				float dy1 = 1.25 * yPixelOffset;\n\n				fDepth = unpackDepth( texture2D( shadowMap[ i ], shadowCoord.xy + vec2( dx0, dy0 ) ) );\n				if ( fDepth < shadowCoord.z ) shadow += shadowDelta;\n\n				fDepth = unpackDepth( texture2D( shadowMap[ i ], shadowCoord.xy + vec2( 0.0, dy0 ) ) );\n				if ( fDepth < shadowCoord.z ) shadow += shadowDelta;\n\n				fDepth = unpackDepth( texture2D( shadowMap[ i ], shadowCoord.xy + vec2( dx1, dy0 ) ) );\n				if ( fDepth < shadowCoord.z ) shadow += shadowDelta;\n\n				fDepth = unpackDepth( texture2D( shadowMap[ i ], shadowCoord.xy + vec2( dx0, 0.0 ) ) );\n				if ( fDepth < shadowCoord.z ) shadow += shadowDelta;\n\n				fDepth = unpackDepth( texture2D( shadowMap[ i ], shadowCoord.xy ) );\n				if ( fDepth < shadowCoord.z ) shadow += shadowDelta;\n\n				fDepth = unpackDepth( texture2D( shadowMap[ i ], shadowCoord.xy + vec2( dx1, 0.0 ) ) );\n				if ( fDepth < shadowCoord.z ) shadow += shadowDelta;\n\n				fDepth = unpackDepth( texture2D( shadowMap[ i ], shadowCoord.xy + vec2( dx0, dy1 ) ) );\n				if ( fDepth < shadowCoord.z ) shadow += shadowDelta;\n\n				fDepth = unpackDepth( texture2D( shadowMap[ i ], shadowCoord.xy + vec2( 0.0, dy1 ) ) );\n				if ( fDepth < shadowCoord.z ) shadow += shadowDelta;\n\n				fDepth = unpackDepth( texture2D( shadowMap[ i ], shadowCoord.xy + vec2( dx1, dy1 ) ) );\n				if ( fDepth < shadowCoord.z ) shadow += shadowDelta;\n\n				shadowColor = shadowColor * vec3( ( 1.0 - shadowDarkness[ i ] * shadow ) );\n\n			#elif defined( SHADOWMAP_TYPE_PCF_SOFT )\n\n						// Percentage-close filtering\n						// (9 pixel kernel)\n						// http://fabiensanglard.net/shadowmappingPCF/\n\n				float shadow = 0.0;\n\n				float xPixelOffset = 1.0 / shadowMapSize[ i ].x;\n				float yPixelOffset = 1.0 / shadowMapSize[ i ].y;\n\n				float dx0 = -1.0 * xPixelOffset;\n				float dy0 = -1.0 * yPixelOffset;\n				float dx1 = 1.0 * xPixelOffset;\n				float dy1 = 1.0 * yPixelOffset;\n\n				mat3 shadowKernel;\n				mat3 depthKernel;\n\n				depthKernel[0][0] = unpackDepth( texture2D( shadowMap[ i ], shadowCoord.xy + vec2( dx0, dy0 ) ) );\n				depthKernel[0][1] = unpackDepth( texture2D( shadowMap[ i ], shadowCoord.xy + vec2( dx0, 0.0 ) ) );\n				depthKernel[0][2] = unpackDepth( texture2D( shadowMap[ i ], shadowCoord.xy + vec2( dx0, dy1 ) ) );\n				depthKernel[1][0] = unpackDepth( texture2D( shadowMap[ i ], shadowCoord.xy + vec2( 0.0, dy0 ) ) );\n				depthKernel[1][1] = unpackDepth( texture2D( shadowMap[ i ], shadowCoord.xy ) );\n				depthKernel[1][2] = unpackDepth( texture2D( shadowMap[ i ], shadowCoord.xy + vec2( 0.0, dy1 ) ) );\n				depthKernel[2][0] = unpackDepth( texture2D( shadowMap[ i ], shadowCoord.xy + vec2( dx1, dy0 ) ) );\n				depthKernel[2][1] = unpackDepth( texture2D( shadowMap[ i ], shadowCoord.xy + vec2( dx1, 0.0 ) ) );\n				depthKernel[2][2] = unpackDepth( texture2D( shadowMap[ i ], shadowCoord.xy + vec2( dx1, dy1 ) ) );\n\n				vec3 shadowZ = vec3( shadowCoord.z );\n				shadowKernel[0] = vec3(lessThan(depthKernel[0], shadowZ ));\n				shadowKernel[0] *= vec3(0.25);\n\n				shadowKernel[1] = vec3(lessThan(depthKernel[1], shadowZ ));\n				shadowKernel[1] *= vec3(0.25);\n\n				shadowKernel[2] = vec3(lessThan(depthKernel[2], shadowZ ));\n				shadowKernel[2] *= vec3(0.25);\n\n				vec2 fractionalCoord = 1.0 - fract( shadowCoord.xy * shadowMapSize[i].xy );\n\n				shadowKernel[0] = mix( shadowKernel[1], shadowKernel[0], fractionalCoord.x );\n				shadowKernel[1] = mix( shadowKernel[2], shadowKernel[1], fractionalCoord.x );\n\n				vec4 shadowValues;\n				shadowValues.x = mix( shadowKernel[0][1], shadowKernel[0][0], fractionalCoord.y );\n				shadowValues.y = mix( shadowKernel[0][2], shadowKernel[0][1], fractionalCoord.y );\n				shadowValues.z = mix( shadowKernel[1][1], shadowKernel[1][0], fractionalCoord.y );\n				shadowValues.w = mix( shadowKernel[1][2], shadowKernel[1][1], fractionalCoord.y );\n\n				shadow = dot( shadowValues, vec4( 1.0 ) );\n\n				shadowColor = shadowColor * vec3( ( 1.0 - shadowDarkness[ i ] * shadow ) );\n\n			#else\n\n				vec4 rgbaDepth = texture2D( shadowMap[ i ], shadowCoord.xy );\n				float fDepth = unpackDepth( rgbaDepth );\n\n				if ( fDepth < shadowCoord.z )\n\n		// spot with multiple shadows is darker\n\n					shadowColor = shadowColor * vec3( 1.0 - shadowDarkness[ i ] );\n\n		// spot with multiple shadows has the same color as single shadow spot\n\n		// 					shadowColor = min( shadowColor, vec3( shadowDarkness[ i ] ) );\n\n			#endif\n\n		}\n\n\n		#ifdef SHADOWMAP_DEBUG\n\n			#ifdef SHADOWMAP_CASCADE\n\n				if ( inFrustum && inFrustumCount == 1 ) gl_FragColor.xyz *= frustumColors[ i ];\n\n			#else\n\n				if ( inFrustum ) gl_FragColor.xyz *= frustumColors[ i ];\n\n			#endif\n\n		#endif\n\n	}\n\n	#ifdef GAMMA_OUTPUT\n\n		shadowColor *= shadowColor;\n\n	#endif\n\n	gl_FragColor.xyz = gl_FragColor.xyz * shadowColor;\n\n#endif\n";
      }
      public String getName() {
        return "getShadowmapFragment";
      }
    }
    ;
  }
  private static class getShadowmapFragmentInitializer {
    static {
      _instance0.getShadowmapFragmentInitializer();
    }
    static org.parallax3d.parallax.system.SourceTextResource get() {
      return getShadowmapFragment;
    }
  }
  public org.parallax3d.parallax.system.SourceTextResource getShadowmapFragment() {
    return getShadowmapFragmentInitializer.get();
  }
  private void getShadowmapParsFragmentInitializer() {
    getShadowmapParsFragment = new org.parallax3d.parallax.system.SourceTextResource() {
      // jar:file:/Users/alfonso/.m2/repository/org/parallax3d/parallax/parallax/2.0-SNAPSHOT/parallax-2.0-SNAPSHOT.jar!/org/parallax3d/parallax/graphics/renderers/shaders/chunk/shadowmap_pars_fragment.glsl
      public String getText() {
        return "#ifdef USE_SHADOWMAP\n\n	uniform sampler2D shadowMap[ MAX_SHADOWS ];\n	uniform vec2 shadowMapSize[ MAX_SHADOWS ];\n\n	uniform float shadowDarkness[ MAX_SHADOWS ];\n	uniform float shadowBias[ MAX_SHADOWS ];\n\n	varying vec4 vShadowCoord[ MAX_SHADOWS ];\n\n	float unpackDepth( const in vec4 rgba_depth ) {\n\n		const vec4 bit_shift = vec4( 1.0 / ( 256.0 * 256.0 * 256.0 ), 1.0 / ( 256.0 * 256.0 ), 1.0 / 256.0, 1.0 );\n		float depth = dot( rgba_depth, bit_shift );\n		return depth;\n\n	}\n\n#endif";
      }
      public String getName() {
        return "getShadowmapParsFragment";
      }
    }
    ;
  }
  private static class getShadowmapParsFragmentInitializer {
    static {
      _instance0.getShadowmapParsFragmentInitializer();
    }
    static org.parallax3d.parallax.system.SourceTextResource get() {
      return getShadowmapParsFragment;
    }
  }
  public org.parallax3d.parallax.system.SourceTextResource getShadowmapParsFragment() {
    return getShadowmapParsFragmentInitializer.get();
  }
  private void getShadowmapParsVertexInitializer() {
    getShadowmapParsVertex = new org.parallax3d.parallax.system.SourceTextResource() {
      // jar:file:/Users/alfonso/.m2/repository/org/parallax3d/parallax/parallax/2.0-SNAPSHOT/parallax-2.0-SNAPSHOT.jar!/org/parallax3d/parallax/graphics/renderers/shaders/chunk/shadowmap_pars_vertex.glsl
      public String getText() {
        return "#ifdef USE_SHADOWMAP\n\n	varying vec4 vShadowCoord[ MAX_SHADOWS ];\n	uniform mat4 shadowMatrix[ MAX_SHADOWS ];\n\n#endif";
      }
      public String getName() {
        return "getShadowmapParsVertex";
      }
    }
    ;
  }
  private static class getShadowmapParsVertexInitializer {
    static {
      _instance0.getShadowmapParsVertexInitializer();
    }
    static org.parallax3d.parallax.system.SourceTextResource get() {
      return getShadowmapParsVertex;
    }
  }
  public org.parallax3d.parallax.system.SourceTextResource getShadowmapParsVertex() {
    return getShadowmapParsVertexInitializer.get();
  }
  private void getShadowmapVertexInitializer() {
    getShadowmapVertex = new org.parallax3d.parallax.system.SourceTextResource() {
      // jar:file:/Users/alfonso/.m2/repository/org/parallax3d/parallax/parallax/2.0-SNAPSHOT/parallax-2.0-SNAPSHOT.jar!/org/parallax3d/parallax/graphics/renderers/shaders/chunk/shadowmap_vertex.glsl
      public String getText() {
        return "#ifdef USE_SHADOWMAP\n\n	for( int i = 0; i < MAX_SHADOWS; i ++ ) {\n\n		vShadowCoord[ i ] = shadowMatrix[ i ] * worldPosition;\n\n	}\n\n#endif";
      }
      public String getName() {
        return "getShadowmapVertex";
      }
    }
    ;
  }
  private static class getShadowmapVertexInitializer {
    static {
      _instance0.getShadowmapVertexInitializer();
    }
    static org.parallax3d.parallax.system.SourceTextResource get() {
      return getShadowmapVertex;
    }
  }
  public org.parallax3d.parallax.system.SourceTextResource getShadowmapVertex() {
    return getShadowmapVertexInitializer.get();
  }
  private void getSkinBaseVertexInitializer() {
    getSkinBaseVertex = new org.parallax3d.parallax.system.SourceTextResource() {
      // jar:file:/Users/alfonso/.m2/repository/org/parallax3d/parallax/parallax/2.0-SNAPSHOT/parallax-2.0-SNAPSHOT.jar!/org/parallax3d/parallax/graphics/renderers/shaders/chunk/skinbase_vertex.glsl
      public String getText() {
        return "#ifdef USE_SKINNING\r\n\r\n	mat4 boneMatX = getBoneMatrix( skinIndex.x );\r\n	mat4 boneMatY = getBoneMatrix( skinIndex.y );\r\n	mat4 boneMatZ = getBoneMatrix( skinIndex.z );\r\n	mat4 boneMatW = getBoneMatrix( skinIndex.w );\r\n\r\n#endif";
      }
      public String getName() {
        return "getSkinBaseVertex";
      }
    }
    ;
  }
  private static class getSkinBaseVertexInitializer {
    static {
      _instance0.getSkinBaseVertexInitializer();
    }
    static org.parallax3d.parallax.system.SourceTextResource get() {
      return getSkinBaseVertex;
    }
  }
  public org.parallax3d.parallax.system.SourceTextResource getSkinBaseVertex() {
    return getSkinBaseVertexInitializer.get();
  }
  private void getSkinNormalVertexInitializer() {
    getSkinNormalVertex = new org.parallax3d.parallax.system.SourceTextResource() {
      // jar:file:/Users/alfonso/.m2/repository/org/parallax3d/parallax/parallax/2.0-SNAPSHOT/parallax-2.0-SNAPSHOT.jar!/org/parallax3d/parallax/graphics/renderers/shaders/chunk/skinnormal_vertex.glsl
      public String getText() {
        return "#ifdef USE_SKINNING\n\n	mat4 skinMatrix = mat4( 0.0 );\n	skinMatrix += skinWeight.x * boneMatX;\n	skinMatrix += skinWeight.y * boneMatY;\n	skinMatrix += skinWeight.z * boneMatZ;\n	skinMatrix += skinWeight.w * boneMatW;\n	skinMatrix  = bindMatrixInverse * skinMatrix * bindMatrix;\n\n	#ifdef USE_MORPHNORMALS\n\n	vec4 skinnedNormal = skinMatrix * vec4( morphedNormal, 0.0 );\n\n	#else\n\n	vec4 skinnedNormal = skinMatrix * vec4( normal, 0.0 );\n\n	#endif\n\n#endif\n";
      }
      public String getName() {
        return "getSkinNormalVertex";
      }
    }
    ;
  }
  private static class getSkinNormalVertexInitializer {
    static {
      _instance0.getSkinNormalVertexInitializer();
    }
    static org.parallax3d.parallax.system.SourceTextResource get() {
      return getSkinNormalVertex;
    }
  }
  public org.parallax3d.parallax.system.SourceTextResource getSkinNormalVertex() {
    return getSkinNormalVertexInitializer.get();
  }
  private void getSkinningParsVertexInitializer() {
    getSkinningParsVertex = new org.parallax3d.parallax.system.SourceTextResource() {
      // jar:file:/Users/alfonso/.m2/repository/org/parallax3d/parallax/parallax/2.0-SNAPSHOT/parallax-2.0-SNAPSHOT.jar!/org/parallax3d/parallax/graphics/renderers/shaders/chunk/skinning_pars_vertex.glsl
      public String getText() {
        return "#ifdef USE_SKINNING\r\n\r\n	uniform mat4 bindMatrix;\r\n	uniform mat4 bindMatrixInverse;\r\n\r\n	#ifdef BONE_TEXTURE\r\n\r\n		uniform sampler2D boneTexture;\r\n		uniform int boneTextureWidth;\r\n		uniform int boneTextureHeight;\r\n\r\n		mat4 getBoneMatrix( const in float i ) {\r\n\r\n			float j = i * 4.0;\r\n			float x = mod( j, float( boneTextureWidth ) );\r\n			float y = floor( j / float( boneTextureWidth ) );\r\n\r\n			float dx = 1.0 / float( boneTextureWidth );\r\n			float dy = 1.0 / float( boneTextureHeight );\r\n\r\n			y = dy * ( y + 0.5 );\r\n\r\n			vec4 v1 = texture2D( boneTexture, vec2( dx * ( x + 0.5 ), y ) );\r\n			vec4 v2 = texture2D( boneTexture, vec2( dx * ( x + 1.5 ), y ) );\r\n			vec4 v3 = texture2D( boneTexture, vec2( dx * ( x + 2.5 ), y ) );\r\n			vec4 v4 = texture2D( boneTexture, vec2( dx * ( x + 3.5 ), y ) );\r\n\r\n			mat4 bone = mat4( v1, v2, v3, v4 );\r\n\r\n			return bone;\r\n\r\n		}\r\n\r\n	#else\r\n\r\n		uniform mat4 boneGlobalMatrices[ MAX_BONES ];\r\n\r\n		mat4 getBoneMatrix( const in float i ) {\r\n\r\n			mat4 bone = boneGlobalMatrices[ int(i) ];\r\n			return bone;\r\n\r\n		}\r\n\r\n	#endif\r\n\r\n#endif\r\n";
      }
      public String getName() {
        return "getSkinningParsVertex";
      }
    }
    ;
  }
  private static class getSkinningParsVertexInitializer {
    static {
      _instance0.getSkinningParsVertexInitializer();
    }
    static org.parallax3d.parallax.system.SourceTextResource get() {
      return getSkinningParsVertex;
    }
  }
  public org.parallax3d.parallax.system.SourceTextResource getSkinningParsVertex() {
    return getSkinningParsVertexInitializer.get();
  }
  private void getSkinningVertexInitializer() {
    getSkinningVertex = new org.parallax3d.parallax.system.SourceTextResource() {
      // jar:file:/Users/alfonso/.m2/repository/org/parallax3d/parallax/parallax/2.0-SNAPSHOT/parallax-2.0-SNAPSHOT.jar!/org/parallax3d/parallax/graphics/renderers/shaders/chunk/skinning_vertex.glsl
      public String getText() {
        return "#ifdef USE_SKINNING\n\n	#ifdef USE_MORPHTARGETS\n\n	vec4 skinVertex = bindMatrix * vec4( morphed, 1.0 );\n\n	#else\n\n	vec4 skinVertex = bindMatrix * vec4( position, 1.0 );\n\n	#endif\n\n	vec4 skinned = vec4( 0.0 );\n	skinned += boneMatX * skinVertex * skinWeight.x;\n	skinned += boneMatY * skinVertex * skinWeight.y;\n	skinned += boneMatZ * skinVertex * skinWeight.z;\n	skinned += boneMatW * skinVertex * skinWeight.w;\n	skinned  = bindMatrixInverse * skinned;\n\n#endif\n";
      }
      public String getName() {
        return "getSkinningVertex";
      }
    }
    ;
  }
  private static class getSkinningVertexInitializer {
    static {
      _instance0.getSkinningVertexInitializer();
    }
    static org.parallax3d.parallax.system.SourceTextResource get() {
      return getSkinningVertex;
    }
  }
  public org.parallax3d.parallax.system.SourceTextResource getSkinningVertex() {
    return getSkinningVertexInitializer.get();
  }
  private void getSpecularmapFragmentInitializer() {
    getSpecularmapFragment = new org.parallax3d.parallax.system.SourceTextResource() {
      // jar:file:/Users/alfonso/.m2/repository/org/parallax3d/parallax/parallax/2.0-SNAPSHOT/parallax-2.0-SNAPSHOT.jar!/org/parallax3d/parallax/graphics/renderers/shaders/chunk/specularmap_fragment.glsl
      public String getText() {
        return "float specularStrength;\r\n\r\n#ifdef USE_SPECULARMAP\r\n\r\n	vec4 texelSpecular = texture2D( specularMap, vUv );\r\n	specularStrength = texelSpecular.r;\r\n\r\n#else\r\n\r\n	specularStrength = 1.0;\r\n\r\n#endif";
      }
      public String getName() {
        return "getSpecularmapFragment";
      }
    }
    ;
  }
  private static class getSpecularmapFragmentInitializer {
    static {
      _instance0.getSpecularmapFragmentInitializer();
    }
    static org.parallax3d.parallax.system.SourceTextResource get() {
      return getSpecularmapFragment;
    }
  }
  public org.parallax3d.parallax.system.SourceTextResource getSpecularmapFragment() {
    return getSpecularmapFragmentInitializer.get();
  }
  private void getSpecularmapParsFragmentInitializer() {
    getSpecularmapParsFragment = new org.parallax3d.parallax.system.SourceTextResource() {
      // jar:file:/Users/alfonso/.m2/repository/org/parallax3d/parallax/parallax/2.0-SNAPSHOT/parallax-2.0-SNAPSHOT.jar!/org/parallax3d/parallax/graphics/renderers/shaders/chunk/specularmap_pars_fragment.glsl
      public String getText() {
        return "#ifdef USE_SPECULARMAP\r\n\r\n	uniform sampler2D specularMap;\r\n\r\n#endif";
      }
      public String getName() {
        return "getSpecularmapParsFragment";
      }
    }
    ;
  }
  private static class getSpecularmapParsFragmentInitializer {
    static {
      _instance0.getSpecularmapParsFragmentInitializer();
    }
    static org.parallax3d.parallax.system.SourceTextResource get() {
      return getSpecularmapParsFragment;
    }
  }
  public org.parallax3d.parallax.system.SourceTextResource getSpecularmapParsFragment() {
    return getSpecularmapParsFragmentInitializer.get();
  }
  private void getWorldposVertexInitializer() {
    getWorldposVertex = new org.parallax3d.parallax.system.SourceTextResource() {
      // jar:file:/Users/alfonso/.m2/repository/org/parallax3d/parallax/parallax/2.0-SNAPSHOT/parallax-2.0-SNAPSHOT.jar!/org/parallax3d/parallax/graphics/renderers/shaders/chunk/worldpos_vertex.glsl
      public String getText() {
        return "#if defined( USE_ENVMAP ) || defined( PHONG ) || defined( LAMBERT ) || defined ( USE_SHADOWMAP )\n\n	#ifdef USE_SKINNING\n\n		vec4 worldPosition = modelMatrix * skinned;\n\n	#endif\n\n	#if defined( USE_MORPHTARGETS ) && ! defined( USE_SKINNING )\n\n		vec4 worldPosition = modelMatrix * vec4( morphed, 1.0 );\n\n	#endif\n\n	#if ! defined( USE_MORPHTARGETS ) && ! defined( USE_SKINNING )\n\n		vec4 worldPosition = modelMatrix * vec4( position, 1.0 );\n\n	#endif\n\n#endif";
      }
      public String getName() {
        return "getWorldposVertex";
      }
    }
    ;
  }
  private static class getWorldposVertexInitializer {
    static {
      _instance0.getWorldposVertexInitializer();
    }
    static org.parallax3d.parallax.system.SourceTextResource get() {
      return getWorldposVertex;
    }
  }
  public org.parallax3d.parallax.system.SourceTextResource getWorldposVertex() {
    return getWorldposVertexInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static org.parallax3d.parallax.system.SourceTextResource getAlphamapFragment;
  private static org.parallax3d.parallax.system.SourceTextResource getAlphamapParsFragment;
  private static org.parallax3d.parallax.system.SourceTextResource getAlphatestFragment;
  private static org.parallax3d.parallax.system.SourceTextResource getBumpmapParsFragment;
  private static org.parallax3d.parallax.system.SourceTextResource getColorFragment;
  private static org.parallax3d.parallax.system.SourceTextResource getColorParsFragment;
  private static org.parallax3d.parallax.system.SourceTextResource getColorParsVertex;
  private static org.parallax3d.parallax.system.SourceTextResource getColorVertex;
  private static org.parallax3d.parallax.system.SourceTextResource getDefaultNormalVertex;
  private static org.parallax3d.parallax.system.SourceTextResource getDefaultVertex;
  private static org.parallax3d.parallax.system.SourceTextResource getEnvmapFragment;
  private static org.parallax3d.parallax.system.SourceTextResource getEnvmapParsFragment;
  private static org.parallax3d.parallax.system.SourceTextResource getEnvmapParsVertex;
  private static org.parallax3d.parallax.system.SourceTextResource getEnvmapVertex;
  private static org.parallax3d.parallax.system.SourceTextResource getFogFragment;
  private static org.parallax3d.parallax.system.SourceTextResource getFogParsFragment;
  private static org.parallax3d.parallax.system.SourceTextResource getLightmapFragment;
  private static org.parallax3d.parallax.system.SourceTextResource getLightmapParsFragment;
  private static org.parallax3d.parallax.system.SourceTextResource getLightmapParsVertex;
  private static org.parallax3d.parallax.system.SourceTextResource getLightmapVertex;
  private static org.parallax3d.parallax.system.SourceTextResource getLightsLambertParsVertex;
  private static org.parallax3d.parallax.system.SourceTextResource getLightsLambertVertex;
  private static org.parallax3d.parallax.system.SourceTextResource getLightsPhongFragment;
  private static org.parallax3d.parallax.system.SourceTextResource getLightsPhongParsFragment;
  private static org.parallax3d.parallax.system.SourceTextResource getLightsPhongParsVertex;
  private static org.parallax3d.parallax.system.SourceTextResource getLightsPhongVertex;
  private static org.parallax3d.parallax.system.SourceTextResource getLinearToGammaFragment;
  private static org.parallax3d.parallax.system.SourceTextResource getLogdepthbufFragment;
  private static org.parallax3d.parallax.system.SourceTextResource getLogdepthbufParFragment;
  private static org.parallax3d.parallax.system.SourceTextResource getLogdepthbufParVertex;
  private static org.parallax3d.parallax.system.SourceTextResource getLogdepthbufVertex;
  private static org.parallax3d.parallax.system.SourceTextResource getMapFragment;
  private static org.parallax3d.parallax.system.SourceTextResource getMapParsFragment;
  private static org.parallax3d.parallax.system.SourceTextResource getMapParsVertex;
  private static org.parallax3d.parallax.system.SourceTextResource getMapParticleFragment;
  private static org.parallax3d.parallax.system.SourceTextResource getMapParticleParsFragment;
  private static org.parallax3d.parallax.system.SourceTextResource getMapVertex;
  private static org.parallax3d.parallax.system.SourceTextResource getMorphnormalVertex;
  private static org.parallax3d.parallax.system.SourceTextResource getMorphtargetParsVertex;
  private static org.parallax3d.parallax.system.SourceTextResource getMorphtargetVertex;
  private static org.parallax3d.parallax.system.SourceTextResource getNormalmapParsFragment;
  private static org.parallax3d.parallax.system.SourceTextResource getShadowmapFragment;
  private static org.parallax3d.parallax.system.SourceTextResource getShadowmapParsFragment;
  private static org.parallax3d.parallax.system.SourceTextResource getShadowmapParsVertex;
  private static org.parallax3d.parallax.system.SourceTextResource getShadowmapVertex;
  private static org.parallax3d.parallax.system.SourceTextResource getSkinBaseVertex;
  private static org.parallax3d.parallax.system.SourceTextResource getSkinNormalVertex;
  private static org.parallax3d.parallax.system.SourceTextResource getSkinningParsVertex;
  private static org.parallax3d.parallax.system.SourceTextResource getSkinningVertex;
  private static org.parallax3d.parallax.system.SourceTextResource getSpecularmapFragment;
  private static org.parallax3d.parallax.system.SourceTextResource getSpecularmapParsFragment;
  private static org.parallax3d.parallax.system.SourceTextResource getWorldposVertex;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      getAlphamapFragment(), 
      getAlphamapParsFragment(), 
      getAlphatestFragment(), 
      getBumpmapParsFragment(), 
      getColorFragment(), 
      getColorParsFragment(), 
      getColorParsVertex(), 
      getColorVertex(), 
      getDefaultNormalVertex(), 
      getDefaultVertex(), 
      getEnvmapFragment(), 
      getEnvmapParsFragment(), 
      getEnvmapParsVertex(), 
      getEnvmapVertex(), 
      getFogFragment(), 
      getFogParsFragment(), 
      getLightmapFragment(), 
      getLightmapParsFragment(), 
      getLightmapParsVertex(), 
      getLightmapVertex(), 
      getLightsLambertParsVertex(), 
      getLightsLambertVertex(), 
      getLightsPhongFragment(), 
      getLightsPhongParsFragment(), 
      getLightsPhongParsVertex(), 
      getLightsPhongVertex(), 
      getLinearToGammaFragment(), 
      getLogdepthbufFragment(), 
      getLogdepthbufParFragment(), 
      getLogdepthbufParVertex(), 
      getLogdepthbufVertex(), 
      getMapFragment(), 
      getMapParsFragment(), 
      getMapParsVertex(), 
      getMapParticleFragment(), 
      getMapParticleParsFragment(), 
      getMapVertex(), 
      getMorphnormalVertex(), 
      getMorphtargetParsVertex(), 
      getMorphtargetVertex(), 
      getNormalmapParsFragment(), 
      getShadowmapFragment(), 
      getShadowmapParsFragment(), 
      getShadowmapParsVertex(), 
      getShadowmapVertex(), 
      getSkinBaseVertex(), 
      getSkinNormalVertex(), 
      getSkinningParsVertex(), 
      getSkinningVertex(), 
      getSpecularmapFragment(), 
      getSpecularmapParsFragment(), 
      getWorldposVertex(), 
    };
  }
  public ResourcePrototype getResource(String name) {
    if (GWT.isScript()) {
      return getResourceNative(name);
    } else {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype>();
        resourceMap.put("getAlphamapFragment", getAlphamapFragment());
        resourceMap.put("getAlphamapParsFragment", getAlphamapParsFragment());
        resourceMap.put("getAlphatestFragment", getAlphatestFragment());
        resourceMap.put("getBumpmapParsFragment", getBumpmapParsFragment());
        resourceMap.put("getColorFragment", getColorFragment());
        resourceMap.put("getColorParsFragment", getColorParsFragment());
        resourceMap.put("getColorParsVertex", getColorParsVertex());
        resourceMap.put("getColorVertex", getColorVertex());
        resourceMap.put("getDefaultNormalVertex", getDefaultNormalVertex());
        resourceMap.put("getDefaultVertex", getDefaultVertex());
        resourceMap.put("getEnvmapFragment", getEnvmapFragment());
        resourceMap.put("getEnvmapParsFragment", getEnvmapParsFragment());
        resourceMap.put("getEnvmapParsVertex", getEnvmapParsVertex());
        resourceMap.put("getEnvmapVertex", getEnvmapVertex());
        resourceMap.put("getFogFragment", getFogFragment());
        resourceMap.put("getFogParsFragment", getFogParsFragment());
        resourceMap.put("getLightmapFragment", getLightmapFragment());
        resourceMap.put("getLightmapParsFragment", getLightmapParsFragment());
        resourceMap.put("getLightmapParsVertex", getLightmapParsVertex());
        resourceMap.put("getLightmapVertex", getLightmapVertex());
        resourceMap.put("getLightsLambertParsVertex", getLightsLambertParsVertex());
        resourceMap.put("getLightsLambertVertex", getLightsLambertVertex());
        resourceMap.put("getLightsPhongFragment", getLightsPhongFragment());
        resourceMap.put("getLightsPhongParsFragment", getLightsPhongParsFragment());
        resourceMap.put("getLightsPhongParsVertex", getLightsPhongParsVertex());
        resourceMap.put("getLightsPhongVertex", getLightsPhongVertex());
        resourceMap.put("getLinearToGammaFragment", getLinearToGammaFragment());
        resourceMap.put("getLogdepthbufFragment", getLogdepthbufFragment());
        resourceMap.put("getLogdepthbufParFragment", getLogdepthbufParFragment());
        resourceMap.put("getLogdepthbufParVertex", getLogdepthbufParVertex());
        resourceMap.put("getLogdepthbufVertex", getLogdepthbufVertex());
        resourceMap.put("getMapFragment", getMapFragment());
        resourceMap.put("getMapParsFragment", getMapParsFragment());
        resourceMap.put("getMapParsVertex", getMapParsVertex());
        resourceMap.put("getMapParticleFragment", getMapParticleFragment());
        resourceMap.put("getMapParticleParsFragment", getMapParticleParsFragment());
        resourceMap.put("getMapVertex", getMapVertex());
        resourceMap.put("getMorphnormalVertex", getMorphnormalVertex());
        resourceMap.put("getMorphtargetParsVertex", getMorphtargetParsVertex());
        resourceMap.put("getMorphtargetVertex", getMorphtargetVertex());
        resourceMap.put("getNormalmapParsFragment", getNormalmapParsFragment());
        resourceMap.put("getShadowmapFragment", getShadowmapFragment());
        resourceMap.put("getShadowmapParsFragment", getShadowmapParsFragment());
        resourceMap.put("getShadowmapParsVertex", getShadowmapParsVertex());
        resourceMap.put("getShadowmapVertex", getShadowmapVertex());
        resourceMap.put("getSkinBaseVertex", getSkinBaseVertex());
        resourceMap.put("getSkinNormalVertex", getSkinNormalVertex());
        resourceMap.put("getSkinningParsVertex", getSkinningParsVertex());
        resourceMap.put("getSkinningVertex", getSkinningVertex());
        resourceMap.put("getSpecularmapFragment", getSpecularmapFragment());
        resourceMap.put("getSpecularmapParsFragment", getSpecularmapParsFragment());
        resourceMap.put("getWorldposVertex", getWorldposVertex());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'getAlphamapFragment': return this.@org.parallax3d.parallax.graphics.renderers.shaders.Chunks::getAlphamapFragment()();
      case 'getAlphamapParsFragment': return this.@org.parallax3d.parallax.graphics.renderers.shaders.Chunks::getAlphamapParsFragment()();
      case 'getAlphatestFragment': return this.@org.parallax3d.parallax.graphics.renderers.shaders.Chunks::getAlphatestFragment()();
      case 'getBumpmapParsFragment': return this.@org.parallax3d.parallax.graphics.renderers.shaders.Chunks::getBumpmapParsFragment()();
      case 'getColorFragment': return this.@org.parallax3d.parallax.graphics.renderers.shaders.Chunks::getColorFragment()();
      case 'getColorParsFragment': return this.@org.parallax3d.parallax.graphics.renderers.shaders.Chunks::getColorParsFragment()();
      case 'getColorParsVertex': return this.@org.parallax3d.parallax.graphics.renderers.shaders.Chunks::getColorParsVertex()();
      case 'getColorVertex': return this.@org.parallax3d.parallax.graphics.renderers.shaders.Chunks::getColorVertex()();
      case 'getDefaultNormalVertex': return this.@org.parallax3d.parallax.graphics.renderers.shaders.Chunks::getDefaultNormalVertex()();
      case 'getDefaultVertex': return this.@org.parallax3d.parallax.graphics.renderers.shaders.Chunks::getDefaultVertex()();
      case 'getEnvmapFragment': return this.@org.parallax3d.parallax.graphics.renderers.shaders.Chunks::getEnvmapFragment()();
      case 'getEnvmapParsFragment': return this.@org.parallax3d.parallax.graphics.renderers.shaders.Chunks::getEnvmapParsFragment()();
      case 'getEnvmapParsVertex': return this.@org.parallax3d.parallax.graphics.renderers.shaders.Chunks::getEnvmapParsVertex()();
      case 'getEnvmapVertex': return this.@org.parallax3d.parallax.graphics.renderers.shaders.Chunks::getEnvmapVertex()();
      case 'getFogFragment': return this.@org.parallax3d.parallax.graphics.renderers.shaders.Chunks::getFogFragment()();
      case 'getFogParsFragment': return this.@org.parallax3d.parallax.graphics.renderers.shaders.Chunks::getFogParsFragment()();
      case 'getLightmapFragment': return this.@org.parallax3d.parallax.graphics.renderers.shaders.Chunks::getLightmapFragment()();
      case 'getLightmapParsFragment': return this.@org.parallax3d.parallax.graphics.renderers.shaders.Chunks::getLightmapParsFragment()();
      case 'getLightmapParsVertex': return this.@org.parallax3d.parallax.graphics.renderers.shaders.Chunks::getLightmapParsVertex()();
      case 'getLightmapVertex': return this.@org.parallax3d.parallax.graphics.renderers.shaders.Chunks::getLightmapVertex()();
      case 'getLightsLambertParsVertex': return this.@org.parallax3d.parallax.graphics.renderers.shaders.Chunks::getLightsLambertParsVertex()();
      case 'getLightsLambertVertex': return this.@org.parallax3d.parallax.graphics.renderers.shaders.Chunks::getLightsLambertVertex()();
      case 'getLightsPhongFragment': return this.@org.parallax3d.parallax.graphics.renderers.shaders.Chunks::getLightsPhongFragment()();
      case 'getLightsPhongParsFragment': return this.@org.parallax3d.parallax.graphics.renderers.shaders.Chunks::getLightsPhongParsFragment()();
      case 'getLightsPhongParsVertex': return this.@org.parallax3d.parallax.graphics.renderers.shaders.Chunks::getLightsPhongParsVertex()();
      case 'getLightsPhongVertex': return this.@org.parallax3d.parallax.graphics.renderers.shaders.Chunks::getLightsPhongVertex()();
      case 'getLinearToGammaFragment': return this.@org.parallax3d.parallax.graphics.renderers.shaders.Chunks::getLinearToGammaFragment()();
      case 'getLogdepthbufFragment': return this.@org.parallax3d.parallax.graphics.renderers.shaders.Chunks::getLogdepthbufFragment()();
      case 'getLogdepthbufParFragment': return this.@org.parallax3d.parallax.graphics.renderers.shaders.Chunks::getLogdepthbufParFragment()();
      case 'getLogdepthbufParVertex': return this.@org.parallax3d.parallax.graphics.renderers.shaders.Chunks::getLogdepthbufParVertex()();
      case 'getLogdepthbufVertex': return this.@org.parallax3d.parallax.graphics.renderers.shaders.Chunks::getLogdepthbufVertex()();
      case 'getMapFragment': return this.@org.parallax3d.parallax.graphics.renderers.shaders.Chunks::getMapFragment()();
      case 'getMapParsFragment': return this.@org.parallax3d.parallax.graphics.renderers.shaders.Chunks::getMapParsFragment()();
      case 'getMapParsVertex': return this.@org.parallax3d.parallax.graphics.renderers.shaders.Chunks::getMapParsVertex()();
      case 'getMapParticleFragment': return this.@org.parallax3d.parallax.graphics.renderers.shaders.Chunks::getMapParticleFragment()();
      case 'getMapParticleParsFragment': return this.@org.parallax3d.parallax.graphics.renderers.shaders.Chunks::getMapParticleParsFragment()();
      case 'getMapVertex': return this.@org.parallax3d.parallax.graphics.renderers.shaders.Chunks::getMapVertex()();
      case 'getMorphnormalVertex': return this.@org.parallax3d.parallax.graphics.renderers.shaders.Chunks::getMorphnormalVertex()();
      case 'getMorphtargetParsVertex': return this.@org.parallax3d.parallax.graphics.renderers.shaders.Chunks::getMorphtargetParsVertex()();
      case 'getMorphtargetVertex': return this.@org.parallax3d.parallax.graphics.renderers.shaders.Chunks::getMorphtargetVertex()();
      case 'getNormalmapParsFragment': return this.@org.parallax3d.parallax.graphics.renderers.shaders.Chunks::getNormalmapParsFragment()();
      case 'getShadowmapFragment': return this.@org.parallax3d.parallax.graphics.renderers.shaders.Chunks::getShadowmapFragment()();
      case 'getShadowmapParsFragment': return this.@org.parallax3d.parallax.graphics.renderers.shaders.Chunks::getShadowmapParsFragment()();
      case 'getShadowmapParsVertex': return this.@org.parallax3d.parallax.graphics.renderers.shaders.Chunks::getShadowmapParsVertex()();
      case 'getShadowmapVertex': return this.@org.parallax3d.parallax.graphics.renderers.shaders.Chunks::getShadowmapVertex()();
      case 'getSkinBaseVertex': return this.@org.parallax3d.parallax.graphics.renderers.shaders.Chunks::getSkinBaseVertex()();
      case 'getSkinNormalVertex': return this.@org.parallax3d.parallax.graphics.renderers.shaders.Chunks::getSkinNormalVertex()();
      case 'getSkinningParsVertex': return this.@org.parallax3d.parallax.graphics.renderers.shaders.Chunks::getSkinningParsVertex()();
      case 'getSkinningVertex': return this.@org.parallax3d.parallax.graphics.renderers.shaders.Chunks::getSkinningVertex()();
      case 'getSpecularmapFragment': return this.@org.parallax3d.parallax.graphics.renderers.shaders.Chunks::getSpecularmapFragment()();
      case 'getSpecularmapParsFragment': return this.@org.parallax3d.parallax.graphics.renderers.shaders.Chunks::getSpecularmapParsFragment()();
      case 'getWorldposVertex': return this.@org.parallax3d.parallax.graphics.renderers.shaders.Chunks::getWorldposVertex()();
    }
    return null;
  }-*/;
}
