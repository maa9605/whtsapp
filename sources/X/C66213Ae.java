package X;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import com.whatsapp.ephemeral.ChangeEphemeralSettingActivity;

/* renamed from: X.3Ae  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C66213Ae extends AbstractC09660eW {
    public final /* synthetic */ Handler A00;
    public final /* synthetic */ ChangeEphemeralSettingActivity A01;

    public C66213Ae(ChangeEphemeralSettingActivity changeEphemeralSettingActivity, Handler handler) {
        this.A01 = changeEphemeralSettingActivity;
        this.A00 = handler;
    }

    @Override // X.AbstractC09660eW
    public void A00(Drawable drawable) {
        this.A00.post(new RunnableEBaseShape8S0100000_I1_0(this, 23));
    }
}
