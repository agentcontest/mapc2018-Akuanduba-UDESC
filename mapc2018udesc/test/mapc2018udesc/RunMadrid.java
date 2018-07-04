package mapc2018udesc;

import static org.junit.Assert.*;

import java.awt.Desktop;
import java.net.URI;

import static org.junit.Assert.*;
import org.junit.Before;
import jacamo.infra.JaCaMoLauncher;
import org.junit.Test;
import massim.Server;
import jason.JasonException;
import org.junit.Test;
public class RunMadrid {

	@Before
	public void setUp() {

		new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					if (Desktop.isDesktopSupported()) {
					    Desktop.getDesktop().browse(new URI("http://127.0.0.1:8000"));
					}
					Server.main(new String[] {"-conf", "conf/madrid.json", "--monitor"});					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}).start();

		try {
			JaCaMoLauncher.main(new String[] {"mapc2018teste.jcm"});
		} catch (JasonException e) {
			System.out.println("Exception: "+e.getMessage());
			e.printStackTrace();
		}

	}

	@Test
	public void run() {
	}


}
