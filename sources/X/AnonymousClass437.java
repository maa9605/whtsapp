package X;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: X.437  reason: invalid class name */
/* loaded from: classes3.dex */
public class AnonymousClass437 {
    public static Set A04;
    public final CameraManager A00;
    public final C44I A01;
    public final Map A03 = new HashMap();
    public final Map A02 = new HashMap();

    public AnonymousClass437(CameraManager cameraManager, C44I c44i) {
        this.A00 = cameraManager;
        this.A01 = c44i;
    }

    public C44B A00(String str) {
        Map map = this.A03;
        C44B c44b = (C44B) map.get(str);
        if (c44b == null) {
            Number number = (Number) AnonymousClass436.A00(str, this.A00).get(CameraCharacteristics.LENS_FACING);
            if (number != null && number.intValue() == 0) {
                c44b = C44B.FRONT;
            } else {
                c44b = C44B.BACK;
            }
            map.put(str, c44b);
        }
        return c44b;
    }

    public String A01(C44B c44b) {
        String[] cameraIdList;
        Map map = this.A02;
        String str = (String) map.get(c44b);
        if (str != null) {
            return str;
        }
        try {
            CameraManager cameraManager = this.A00;
            for (String str2 : cameraManager.getCameraIdList()) {
                Object obj = AnonymousClass436.A00(str2, cameraManager).get(CameraCharacteristics.LENS_FACING);
                if (obj != null) {
                    if (obj.equals(Integer.valueOf(c44b == C44B.FRONT ? 0 : 1))) {
                        map.put(c44b, str2);
                        return str2;
                    }
                }
            }
            StringBuilder A0P = C000200d.A0P("Could not find Camera ID for Facing: ");
            A0P.append(c44b.toString());
            throw new AnonymousClass435(A0P.toString());
        } catch (CameraAccessException e) {
            StringBuilder A0P2 = C000200d.A0P("Could not get Camera Characteristics for Facing: ");
            A0P2.append(c44b.toString());
            throw new AnonymousClass435(A0P2.toString(), e);
        }
    }

    public boolean A02(Integer num) {
        Set set = A04;
        HashSet hashSet = set;
        if (set == null) {
            HashSet hashSet2 = new HashSet();
            CameraManager cameraManager = this.A00;
            for (String str : cameraManager.getCameraIdList()) {
                hashSet2.add(cameraManager.getCameraCharacteristics(str).get(CameraCharacteristics.LENS_FACING));
            }
            A04 = hashSet2;
            hashSet = hashSet2;
        }
        return hashSet.contains(num);
    }
}
