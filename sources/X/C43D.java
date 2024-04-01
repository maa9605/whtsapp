package X;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.MediaRecorder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.43D  reason: invalid class name */
/* loaded from: classes3.dex */
public class C43D {
    public static final int[] A00 = new int[0];

    public static List A00(int i, StreamConfigurationMap streamConfigurationMap) {
        if (i == 0) {
            return C07K.A11(streamConfigurationMap != null ? streamConfigurationMap.getOutputSizes(SurfaceTexture.class) : null);
        } else if (i == 1) {
            return C07K.A11(streamConfigurationMap != null ? streamConfigurationMap.getOutputSizes(256) : null);
        } else if (i == 2) {
            return C07K.A11(streamConfigurationMap != null ? streamConfigurationMap.getOutputSizes(MediaRecorder.class) : null);
        } else if (i == 3) {
            return C07K.A11(streamConfigurationMap != null ? streamConfigurationMap.getOutputSizes(35) : null);
        } else {
            throw new RuntimeException(C000200d.A0D("Invalid supported size type: ", i));
        }
    }

    public static List A01(List list) {
        if (list == null) {
            return Collections.emptyList();
        }
        return Collections.unmodifiableList(new ArrayList(list));
    }

    public static boolean A02(CameraCharacteristics cameraCharacteristics, int i) {
        int intValue = ((Number) cameraCharacteristics.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL)).intValue();
        return intValue == 2 ? i == intValue : intValue >= i;
    }
}
