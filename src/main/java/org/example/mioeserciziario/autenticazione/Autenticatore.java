package org.example.mioeserciziario.autenticazione;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Autenticatore {
    private Map<String, String> myMap;

    public Autenticatore() {
        myMap = new HashMap<String, String>();
        myMap.put("Mario89", "beta1710");
        myMap.put("Fabio88", "omega1089");
        myMap.put("FireFox", "alfa1010");
    }


    public boolean login(String newUsername, String newPassword) {
        String pass = myMap.get(newUsername);

        if (pass != null)
            if (pass.equals(newPassword))
                return true;

        return false;
    }

}

