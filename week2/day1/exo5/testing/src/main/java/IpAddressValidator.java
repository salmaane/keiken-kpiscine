public class IpAddressValidator {


    public boolean validateIpv4Address(String ip) {
        String[] parts = ip.split("\\.");

        if (parts.length != 4) {
            return false;
        }

        for (int i = 0; i < parts.length; i++) {
            String part = parts[i];
            int num;

            try {
                num = Integer.parseInt(part);
            } catch (NumberFormatException e) {
                return false;
            }

            if (num < 0 || num > 255) {
                return false;
            }

            if (i == 0 && (num == 0 || num == 255)) {
                return false;
            }

            if (i == 3 && (num == 0 || num == 255)) {
                return false;
            }
        }

        return true;
    }
}
