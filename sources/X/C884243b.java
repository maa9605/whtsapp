package X;

import android.graphics.Rect;
import android.hardware.camera2.params.MeteringRectangle;
import java.util.List;

/* renamed from: X.43b  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C884243b {
    public Rect A00;
    public Rect A01;
    public AnonymousClass456 A02;
    public AnonymousClass457 A03;
    public AbstractC885543o A04;
    public List A05;
    public MeteringRectangle[] A06;
    public MeteringRectangle[] A07;

    public int A00() {
        AnonymousClass456 anonymousClass456 = this.A02;
        if (anonymousClass456 == null) {
            return 0;
        }
        return ((Number) anonymousClass456.A00(AbstractC886243v.A0k)).intValue();
    }

    public Rect A01(Rect rect) {
        Rect rect2;
        if (this.A01 == null || (rect2 = this.A00) == null) {
            return rect;
        }
        float width = rect2.width() / this.A01.width();
        float height = this.A00.height() / this.A01.height();
        int width2 = (this.A01.width() - this.A00.width()) >> 1;
        int height2 = (this.A01.height() - this.A00.height()) >> 1;
        int centerX = (int) ((rect.centerX() * width) + width2);
        int centerY = (int) ((rect.centerY() * height) + height2);
        Rect rect3 = new Rect(centerX, centerY, centerX, centerY);
        rect3.inset((-rect.width()) >> 1, (-rect.height()) >> 1);
        return rect3;
    }

    public final MeteringRectangle[] A02(MeteringRectangle[] meteringRectangleArr) {
        AnonymousClass456 anonymousClass456 = this.A02;
        if (anonymousClass456 == null || this.A00 == null) {
            throw new IllegalStateException("Creating Metering Rects for zoom with mCameraSettings or mCropRectangle null.");
        }
        return ((Number) anonymousClass456.A00(AbstractC886243v.A0k)).intValue() == 0 ? meteringRectangleArr : new MeteringRectangle[]{new MeteringRectangle(new Rect(0, 0, this.A00.width(), this.A00.height()), 0)};
    }
}
