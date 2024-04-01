package X;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import com.whatsapp.backup.google.GoogleDriveRestoreAnimationView;

/* renamed from: X.2m9  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C55762m9 extends Animation {
    public final GoogleDriveRestoreAnimationView A00;

    public C55762m9(GoogleDriveRestoreAnimationView googleDriveRestoreAnimationView) {
        this.A00 = googleDriveRestoreAnimationView;
    }

    @Override // android.view.animation.Animation
    public void applyTransformation(float f, Transformation transformation) {
        GoogleDriveRestoreAnimationView googleDriveRestoreAnimationView = this.A00;
        googleDriveRestoreAnimationView.A00 = f;
        googleDriveRestoreAnimationView.invalidate();
    }
}
