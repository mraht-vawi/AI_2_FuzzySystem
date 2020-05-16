package application;

import java.util.Locale;
import java.util.Random;

public class Utilities {
    private static Utilities instance;

    public static Utilities getInstance() {
	if (instance == null) {
	    instance = new Utilities();
	}

	return instance;
    }

    protected Utilities() {
    }

    public int generateRandom(int min, int max) {
	Random r = new Random();
	return r.nextInt((max - min) + 1) + min;
    }

    public enum OSType {
	Windows, MacOS, Unix, Other
    };

    protected static OSType osType;

    public OSType getOperatingSystemType() {
	if (osType == null) {
	    String osName = System.getProperty("os.name", "generic").toLowerCase(Locale.ENGLISH);

	    if (osName.contains("mac") || osName.contains("darwin")) {
		osType = OSType.MacOS;
	    } else if (osName.contains("win")) {
		osType = OSType.Windows;
	    } else if (osName.contains("nux")) {
		osType = OSType.Unix;
	    } else {
		osType = OSType.Other;
	    }
	}

	return osType;
    }

    public int divide(int dividend, int divisor) {
	if (divisor == 0) {
	    return 0;
	} else {
	    return dividend / divisor;
	}
    }
}