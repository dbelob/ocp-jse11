package acme.tests.chapter10.test33;

import java.security.*;
import java.util.HashMap;
import java.util.Map;

public class UserProfile {
    private static class UserEntry {
        private final UserProfile value;
        private final Permission permission;

        public UserEntry(UserProfile value, Permission permission) {
            this.value = value;
            this.permission = permission;
        }

        public UserProfile getValue() {
            return value;
        }

        public Permission getPermission() {
            return permission;
        }
    }

    public static Permission getPermission(String check) {
        // Implementation Omitted
        return null;
    }

    private static Map<String,UserEntry> data = new HashMap<>();
    public static UserProfile getProfile(String check) {
        var securityRecord = data.get(check);
        if (securityRecord != null)
            return securityRecord.getValue();              // h1

        var permission = getPermission(check);
        var permCol = permission.newPermissionCollection();
        permCol.add(permission);
        var prof = AccessController.doPrivileged(         // h2
                new PrivilegedAction<UserProfile>() {
                    public UserProfile run() {
                        return new UserProfile();
                    }},
                new AccessControlContext(
                        new ProtectionDomain[] {
                                new ProtectionDomain(null, permCol)
                        }));
        data.put(check, new UserEntry(prof, permission)); // h3
        return prof;
    }
}
