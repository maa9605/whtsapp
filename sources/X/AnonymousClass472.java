package X;

import com.whatsapp.camera.litecamera.LiteCameraView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* renamed from: X.472  reason: invalid class name */
/* loaded from: classes3.dex */
public class AnonymousClass472 {
    public final /* synthetic */ LiteCameraView A00;

    public AnonymousClass472(LiteCameraView liteCameraView) {
        this.A00 = liteCameraView;
    }

    public void A00() {
        LiteCameraView liteCameraView = this.A00;
        liteCameraView.A0F = true;
        liteCameraView.A05 = false;
        if (liteCameraView.AFI()) {
            if (liteCameraView.A04.isEmpty()) {
                liteCameraView.A04 = Collections.unmodifiableList(Arrays.asList("off", "on"));
                liteCameraView.A01();
            }
        } else if (liteCameraView.A03.isEmpty()) {
            if (!liteCameraView.AFI()) {
                ArrayList arrayList = new ArrayList(3);
                arrayList.add("off");
                C44W c44w = liteCameraView.A0A;
                if (c44w.A06(LiteCameraView.A00("on"))) {
                    arrayList.add("on");
                }
                if (c44w.A06(LiteCameraView.A00("auto"))) {
                    arrayList.add("auto");
                }
                liteCameraView.A03 = Collections.unmodifiableList(arrayList);
                liteCameraView.A01();
            } else {
                throw new IllegalStateException("Cannot create back camera flash list while in front camera");
            }
        }
        if (!liteCameraView.getFlashModes().contains(liteCameraView.A02)) {
            liteCameraView.A02 = "off";
        }
        C44W c44w2 = liteCameraView.A0A;
        c44w2.A02(LiteCameraView.A00(liteCameraView.A02));
        liteCameraView.A07 = c44w2.A06(3);
        InterfaceC49112In interfaceC49112In = liteCameraView.A00;
        if (interfaceC49112In != null) {
            interfaceC49112In.ANK();
        }
    }
}
