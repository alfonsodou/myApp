package org.javahispano.jfootball.client.application.animation;

import org.parallax3d.parallax.AnimationAdapter;
import org.parallax3d.parallax.RenderingContext;
import org.parallax3d.parallax.graphics.cameras.PerspectiveCamera;
import org.parallax3d.parallax.graphics.core.AbstractGeometry;
import org.parallax3d.parallax.graphics.lights.DirectionalLight;
import org.parallax3d.parallax.graphics.materials.MeshLambertMaterial;
import org.parallax3d.parallax.graphics.objects.Mesh;
import org.parallax3d.parallax.graphics.scenes.Scene;
import org.parallax3d.parallax.loaders.JsonLoader;
import org.parallax3d.parallax.loaders.Loader;
import org.parallax3d.parallax.loaders.ModelLoadHandler;
import org.parallax3d.parallax.math.Color;
import org.parallax3d.parallax.math.Mathematics;
import org.parallax3d.parallax.math.Vector3;
import org.parallax3d.parallax.system.Duration;

public final class MyAnimation3 extends AnimationAdapter {

	private static final String model = "models/animated/horse.js";

	static final int radius = 600;

	double theta = 0;

	Scene scene;
	PerspectiveCamera camera;
	Mesh mesh;
	Vector3 target = new Vector3(0, 150, 0);

	static final int aminationDuration = 1000;
	static final int keyframes = 15;
	static final double interpolation = (double) aminationDuration / keyframes;

	int lastKeyframe = 0;
	int currentKeyframe = 0;

	@Override
	public void onStart(RenderingContext context) {
		scene = new Scene();
		camera = new PerspectiveCamera(50, // fov
				context.getAspectRation(), // aspect
				1, // near
				10000 // far
		);

		camera.getPosition().setY(300);

		DirectionalLight light = new DirectionalLight(0xefefff, 2);
		light.getPosition().set(1, 1, 1).normalize();
		scene.add(light);

		DirectionalLight light1 = new DirectionalLight(0xffefef, 2);
		light1.getPosition().set(-1, -1, -1).normalize();
		scene.add(light1);

		new JsonLoader(model, new ModelLoadHandler() {

			@Override
			public void onModelLoaded(Loader loader, AbstractGeometry geometry) {

				MeshLambertMaterial material = new MeshLambertMaterial();
				material.setColor(new Color(0x606060));
				material.setMorphTargets(true);
				mesh = new Mesh(geometry, material);
				mesh.getScale().set(1.5);

				scene.add(mesh);

			}
		});

		context.getRenderer().setClearColor(0xf0f0f0);
	}

	@Override
	public void onUpdate(RenderingContext context) {
		theta += 0.1;

		camera.getPosition().setX(radius * Math.sin(Mathematics.degToRad(theta)));
		camera.getPosition().setZ(radius * Math.cos(Mathematics.degToRad(theta)));

		camera.lookAt(target);

		if (mesh != null) {
			// Alternate morph targets
			double time = Duration.currentTimeMillis() % aminationDuration;

			int keyframe = (int) Math.floor(time / interpolation);

			if (keyframe != currentKeyframe) {
				mesh.morphTargetInfluences.set(lastKeyframe, 0.0);
				mesh.morphTargetInfluences.set(currentKeyframe, 1.0);
				mesh.morphTargetInfluences.set(keyframe, 0.0);

				lastKeyframe = currentKeyframe;
				currentKeyframe = keyframe;
			}

			mesh.morphTargetInfluences.set(keyframe, (double) (time % interpolation) / interpolation);
			mesh.morphTargetInfluences.set(lastKeyframe, 1.0 - mesh.morphTargetInfluences.get(keyframe));
		}

		context.getRenderer().render(scene, camera);
	}

}
