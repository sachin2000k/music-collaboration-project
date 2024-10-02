// SystemSettings.java

import java.util.HashMap;
import java.util.Map;

/**
 * Class representing system-wide settings and configurations.
 */
public class SystemSettings {
    private Map<String, String> settings;

    public SystemSettings() {
        settings = new HashMap<>();
    }

    public void updateSetting(String preference, String value) {
        settings.put(preference, value);
    }

    public String getSetting(String preference) {
        return settings.getOrDefault(preference, "Not set");
    }
}
