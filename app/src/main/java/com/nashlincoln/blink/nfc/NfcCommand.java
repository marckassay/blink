package com.nashlincoln.blink.nfc;

import com.nashlincoln.blink.model.Group;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nash on 11/2/14.
 */
public class NfcCommand {
    public Long i;
    public List<Update> u;

    public static class Update {
        public Long i;
        public String v;
    }
}
