package X;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.436  reason: invalid class name */
/* loaded from: classes3.dex */
public class AnonymousClass436 {
    public static final Map A00 = new HashMap();

    public static CameraCharacteristics A00(String str, CameraManager cameraManager) {
        Map map = A00;
        CameraCharacteristics cameraCharacteristics = (CameraCharacteristics) map.get(str);
        if (cameraCharacteristics != null) {
            return cameraCharacteristics;
        }
        try {
            CameraCharacteristics cameraCharacteristics2 = cameraManager.getCameraCharacteristics(str);
            map.put(str, cameraCharacteristics2);
            return cameraCharacteristics2;
        } catch (CameraAccessException e) {
            throw new AnonymousClass435(C000200d.A0H("Could not get Camera Characteristics for Camera ID: ", str), e);
        }
    }

    public static boolean A01(CameraManager cameraManager, String str, int i) {
        if (str != null) {
            int[] iArr = (int[]) A00(str, cameraManager).get(CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES);
            if (iArr == null) {
                return false;
            }
            for (int i2 : iArr) {
                if (i2 == i) {
                    return true;
                }
            }
            return false;
        }
        throw new AnonymousClass435("Camera ID must be provided to check supported focus modes.");
    }
}
