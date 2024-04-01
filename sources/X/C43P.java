package X;

import android.hardware.camera2.CameraAccessException;
import java.util.concurrent.Callable;

/* renamed from: X.43P  reason: invalid class name */
/* loaded from: classes3.dex */
public class C43P implements Callable {
    public final /* synthetic */ C43T A00;
    public final /* synthetic */ boolean A01;
    public final /* synthetic */ boolean A02;

    public C43P(C43T c43t, boolean z, boolean z2) {
        this.A00 = c43t;
        this.A01 = z;
        this.A02 = z2;
    }

    @Override // java.util.concurrent.Callable
    public /* bridge */ /* synthetic */ Object call() {
        try {
            this.A00.A08(this.A01, this.A02);
            return null;
        } catch (CameraAccessException | IllegalArgumentException unused) {
            return null;
        } catch (Exception e) {
            StringBuilder A0P = C000200d.A0P("Could not start preview: ");
            A0P.append(e.getMessage());
            throw new AnonymousClass435(A0P.toString());
        }
    }
}
