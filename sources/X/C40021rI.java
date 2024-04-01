package X;

import com.whatsapp.util.crash.SigquitBasedANRDetector;
import java.io.File;

/* renamed from: X.1rI  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C40021rI {
    public final File A00;
    public final /* synthetic */ SigquitBasedANRDetector A01;

    public C40021rI(SigquitBasedANRDetector sigquitBasedANRDetector, File file) {
        this.A01 = sigquitBasedANRDetector;
        this.A00 = file;
    }

    public final void A00() {
        SigquitBasedANRDetector sigquitBasedANRDetector = this.A01;
        if (sigquitBasedANRDetector.A09 != null) {
            sigquitBasedANRDetector.A09.post(new RunnableEBaseShape7S0100000_I0_7(this, 28));
        }
    }
}
