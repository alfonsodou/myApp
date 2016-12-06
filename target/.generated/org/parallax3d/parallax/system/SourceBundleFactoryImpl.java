package org.parallax3d.parallax.system;

import org.parallax3d.parallax.system.SourceBundle;
import org.parallax3d.parallax.system.SourceBundleFactory;
import com.google.gwt.core.client.GWT;
import org.parallax3d.parallax.system.FastMap;

public class SourceBundleFactoryImpl implements org.parallax3d.parallax.system.SourceBundleFactory {
  private static final FastMap<SourceBundle> MAP = new FastMap<SourceBundle>(){{
  put("org.parallax3d.parallax.graphics.renderers.plugins.effects.shaders.ParallaxBarrierShader.Resources", new org.parallax3d.parallax.graphics.renderers.plugins.effects.shaders.ParallaxBarrierShader_Resources_default_InlineClientBundleGenerator() );
  put("org.parallax3d.parallax.graphics.renderers.shaders.DepthShader.Resources", new org.parallax3d.parallax.graphics.renderers.shaders.DepthShader_Resources_default_InlineClientBundleGenerator() );
  put("org.parallax3d.parallax.graphics.renderers.plugins.postprocessing.shaders.LuminosityShader.Resources", new org.parallax3d.parallax.graphics.renderers.plugins.postprocessing.shaders.LuminosityShader_Resources_default_InlineClientBundleGenerator() );
  put("org.parallax3d.parallax.graphics.renderers.shaders.BasicShader.Resources", new org.parallax3d.parallax.graphics.renderers.shaders.BasicShader_Resources_default_InlineClientBundleGenerator() );
  put("org.parallax3d.parallax.graphics.renderers.plugins.postprocessing.shaders.SSAOShader.Resources", new org.parallax3d.parallax.graphics.renderers.plugins.postprocessing.shaders.SSAOShader_Resources_default_InlineClientBundleGenerator() );
  put("org.parallax3d.parallax.graphics.renderers.plugins.postprocessing.shaders.UnpackDepthRGBAShader.Resources", new org.parallax3d.parallax.graphics.renderers.plugins.postprocessing.shaders.UnpackDepthRGBAShader_Resources_default_InlineClientBundleGenerator() );
  put("org.parallax3d.parallax.graphics.renderers.plugins.postprocessing.shaders.BrightnessContrastShader.Resources", new org.parallax3d.parallax.graphics.renderers.plugins.postprocessing.shaders.BrightnessContrastShader_Resources_default_InlineClientBundleGenerator() );
  put("org.parallax3d.parallax.graphics.renderers.plugins.postprocessing.shaders.BokehShader.Resources", new org.parallax3d.parallax.graphics.renderers.plugins.postprocessing.shaders.BokehShader_Resources_default_InlineClientBundleGenerator() );
  put("org.parallax3d.parallax.graphics.renderers.plugins.postprocessing.shaders.FocusShader.Resources", new org.parallax3d.parallax.graphics.renderers.plugins.postprocessing.shaders.FocusShader_Resources_default_InlineClientBundleGenerator() );
  put("org.parallax3d.parallax.graphics.renderers.plugins.postprocessing.shaders.CopyShader.Resources", new org.parallax3d.parallax.graphics.renderers.plugins.postprocessing.shaders.CopyShader_Resources_default_InlineClientBundleGenerator() );
  put("org.parallax3d.parallax.graphics.renderers.plugins.postprocessing.shaders.BlendShader.Resources", new org.parallax3d.parallax.graphics.renderers.plugins.postprocessing.shaders.BlendShader_Resources_default_InlineClientBundleGenerator() );
  put("org.parallax3d.parallax.graphics.renderers.plugins.postprocessing.shaders.ColorCorrectionShader.Resources", new org.parallax3d.parallax.graphics.renderers.plugins.postprocessing.shaders.ColorCorrectionShader_Resources_default_InlineClientBundleGenerator() );
  put("org.parallax3d.parallax.graphics.renderers.shaders.CubeShader.Resources", new org.parallax3d.parallax.graphics.renderers.shaders.CubeShader_Resources_default_InlineClientBundleGenerator() );
  put("org.parallax3d.parallax.graphics.renderers.plugins.postprocessing.shaders.DotScreenShader.Resources", new org.parallax3d.parallax.graphics.renderers.plugins.postprocessing.shaders.DotScreenShader_Resources_default_InlineClientBundleGenerator() );
  put("org.parallax3d.parallax.graphics.renderers.plugins.postprocessing.shaders.HorizontalBlurShader.Resources", new org.parallax3d.parallax.graphics.renderers.plugins.postprocessing.shaders.HorizontalBlurShader_Resources_default_InlineClientBundleGenerator() );
  put("org.parallax3d.parallax.graphics.renderers.plugins.lensflare.shaders.LensFlareVertexTextureShader.Resources", new org.parallax3d.parallax.graphics.renderers.plugins.lensflare.shaders.LensFlareVertexTextureShader_Resources_default_InlineClientBundleGenerator() );
  put("org.parallax3d.parallax.graphics.renderers.plugins.postprocessing.shaders.VignetteShader.Resources", new org.parallax3d.parallax.graphics.renderers.plugins.postprocessing.shaders.VignetteShader_Resources_default_InlineClientBundleGenerator() );
  put("org.parallax3d.parallax.graphics.renderers.plugins.postprocessing.shaders.TriangleBlurShader.Resources", new org.parallax3d.parallax.graphics.renderers.plugins.postprocessing.shaders.TriangleBlurShader_Resources_default_InlineClientBundleGenerator() );
  put("org.parallax3d.parallax.graphics.renderers.plugins.postprocessing.shaders.VerticalTiltShiftShader.Resources", new org.parallax3d.parallax.graphics.renderers.plugins.postprocessing.shaders.VerticalTiltShiftShader_Resources_default_InlineClientBundleGenerator() );
  put("org.parallax3d.parallax.graphics.renderers.shaders.NormalMapShader.Resources", new org.parallax3d.parallax.graphics.renderers.shaders.NormalMapShader_Resources_default_InlineClientBundleGenerator() );
  put("org.parallax3d.parallax.graphics.renderers.plugins.effects.shaders.OculusRiftShader.Resources", new org.parallax3d.parallax.graphics.renderers.plugins.effects.shaders.OculusRiftShader_Resources_default_InlineClientBundleGenerator() );
  put("org.parallax3d.parallax.graphics.renderers.shaders.Shader.DefaultResources", new org.parallax3d.parallax.graphics.renderers.shaders.Shader_DefaultResources_default_InlineClientBundleGenerator() );
  put("org.parallax3d.parallax.graphics.renderers.shaders.DashedShader.Resources", new org.parallax3d.parallax.graphics.renderers.shaders.DashedShader_Resources_default_InlineClientBundleGenerator() );
  put("org.parallax3d.parallax.graphics.renderers.plugins.effects.shaders.AnaglyphShader.Resources", new org.parallax3d.parallax.graphics.renderers.plugins.effects.shaders.AnaglyphShader_Resources_default_InlineClientBundleGenerator() );
  put("org.parallax3d.parallax.graphics.renderers.plugins.postprocessing.shaders.SepiaShader.Resources", new org.parallax3d.parallax.graphics.renderers.plugins.postprocessing.shaders.SepiaShader_Resources_default_InlineClientBundleGenerator() );
  put("org.parallax3d.parallax.graphics.renderers.plugins.postprocessing.shaders.VerticalBlurShader.Resources", new org.parallax3d.parallax.graphics.renderers.plugins.postprocessing.shaders.VerticalBlurShader_Resources_default_InlineClientBundleGenerator() );
  put("org.parallax3d.parallax.graphics.renderers.plugins.postprocessing.shaders.DOFMipMapShader.Resources", new org.parallax3d.parallax.graphics.renderers.plugins.postprocessing.shaders.DOFMipMapShader_Resources_default_InlineClientBundleGenerator() );
  put("org.parallax3d.parallax.graphics.renderers.plugins.postprocessing.shaders.NormalMapShader.Resources", new org.parallax3d.parallax.graphics.renderers.plugins.postprocessing.shaders.NormalMapShader_Resources_default_InlineClientBundleGenerator() );
  put("org.parallax3d.parallax.graphics.renderers.plugins.lensflare.shaders.LensFlareShader.Resources", new org.parallax3d.parallax.graphics.renderers.plugins.lensflare.shaders.LensFlareShader_Resources_default_InlineClientBundleGenerator() );
  put("org.parallax3d.parallax.graphics.renderers.shaders.LambertShader.Resources", new org.parallax3d.parallax.graphics.renderers.shaders.LambertShader_Resources_default_InlineClientBundleGenerator() );
  put("org.parallax3d.parallax.graphics.renderers.plugins.postprocessing.shaders.ConvolutionShader.Resources", new org.parallax3d.parallax.graphics.renderers.plugins.postprocessing.shaders.ConvolutionShader_Resources_default_InlineClientBundleGenerator() );
  put("org.parallax3d.parallax.graphics.renderers.shaders.ParticleBasicShader.Resources", new org.parallax3d.parallax.graphics.renderers.shaders.ParticleBasicShader_Resources_default_InlineClientBundleGenerator() );
  put("org.parallax3d.parallax.graphics.renderers.plugins.sprite.shaders.SpriteShader.Resources", new org.parallax3d.parallax.graphics.renderers.plugins.sprite.shaders.SpriteShader_Resources_default_InlineClientBundleGenerator() );
  put("org.parallax3d.parallax.graphics.renderers.plugins.postprocessing.shaders.ColorifyShader.Resources", new org.parallax3d.parallax.graphics.renderers.plugins.postprocessing.shaders.ColorifyShader_Resources_default_InlineClientBundleGenerator() );
  put("org.parallax3d.parallax.graphics.renderers.plugins.postprocessing.shaders.BleachBypassShader.Resources", new org.parallax3d.parallax.graphics.renderers.plugins.postprocessing.shaders.BleachBypassShader_Resources_default_InlineClientBundleGenerator() );
  put("org.parallax3d.parallax.graphics.renderers.shaders.DepthRGBAShader.Resources", new org.parallax3d.parallax.graphics.renderers.shaders.DepthRGBAShader_Resources_default_InlineClientBundleGenerator() );
  put("org.parallax3d.parallax.graphics.renderers.plugins.postprocessing.shaders.HueSaturationShader.Resources", new org.parallax3d.parallax.graphics.renderers.plugins.postprocessing.shaders.HueSaturationShader_Resources_default_InlineClientBundleGenerator() );
  put("org.parallax3d.parallax.graphics.renderers.plugins.postprocessing.shaders.FXAAShader.Resources", new org.parallax3d.parallax.graphics.renderers.plugins.postprocessing.shaders.FXAAShader_Resources_default_InlineClientBundleGenerator() );
  put("org.parallax3d.parallax.graphics.renderers.plugins.postprocessing.shaders.FilmShader.Resources", new org.parallax3d.parallax.graphics.renderers.plugins.postprocessing.shaders.FilmShader_Resources_default_InlineClientBundleGenerator() );
  put("org.parallax3d.parallax.graphics.renderers.shaders.NormalShader.Resources", new org.parallax3d.parallax.graphics.renderers.shaders.NormalShader_Resources_default_InlineClientBundleGenerator() );
  put("org.parallax3d.parallax.graphics.renderers.shaders.FresnelShader.Resources", new org.parallax3d.parallax.graphics.renderers.shaders.FresnelShader_Resources_default_InlineClientBundleGenerator() );
  put("org.parallax3d.parallax.graphics.renderers.plugins.postprocessing.shaders.HorizontalTiltShiftShader.Resources", new org.parallax3d.parallax.graphics.renderers.plugins.postprocessing.shaders.HorizontalTiltShiftShader_Resources_default_InlineClientBundleGenerator() );
  put("org.parallax3d.parallax.graphics.renderers.shaders.PhongShader.Resources", new org.parallax3d.parallax.graphics.renderers.shaders.PhongShader_Resources_default_InlineClientBundleGenerator() );
  put("org.parallax3d.parallax.graphics.renderers.shaders.Chunks", new org.parallax3d.parallax.graphics.renderers.shaders.Chunks_default_InlineClientBundleGenerator() );
  }};
  public <T> T get(Class<? extends SourceBundle> classLiteral) {
  if (MAP.containsKey(classLiteral.getCanonicalName())) {
  return (T) MAP.get(classLiteral.getCanonicalName());
  }
  return null;
  }
}
