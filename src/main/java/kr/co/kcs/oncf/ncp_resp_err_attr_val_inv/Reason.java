
package kr.co.kcs.oncf.ncp_resp_err_attr_val_inv;

import java.util.HashMap;
import java.util.Map;

public enum Reason {

    NCP_ERR_VAL_ATTR_INV(0),
    NCP_ERR_VAL_ATTR_RANGE(1),
    NCP_ERR_VAL_ATTR_REFR(2),
    NCP_ERR_VAL_ATTR_REQD(3);
    private final Integer value;
    private final static Map<Integer, Reason> CONSTANTS = new HashMap<Integer, Reason>();

    static {
        for (Reason c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    Reason(Integer value) {
        this.value = value;
    }

    public Integer value() {
        return value;
    }

    public static Reason fromValue(Integer value) {
        Reason constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException((value +""));
        } else {
            return constant;
        }
    }

}
