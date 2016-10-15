package com.mwojnar.Game.client;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.backends.gwt.GwtApplication;
import com.badlogic.gdx.backends.gwt.GwtApplicationConfiguration;
import com.mwojnar.Screens.GameScreen;
import com.mwojnar.Game.SpookyGameJamGame;

public class HtmlLauncher extends GwtApplication {

        @Override
        public GwtApplicationConfiguration getConfig () {
                return new GwtApplicationConfiguration(480, 320);
        }

        @Override
        public ApplicationListener getApplicationListener () {
                return new SpookyGameJamGame(GameScreen.class);
        }

		@Override
		public ApplicationListener createApplicationListener() {
			return null;
		}
}