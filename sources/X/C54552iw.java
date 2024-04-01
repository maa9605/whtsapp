package X;

import android.content.Intent;
import androidx.fragment.app.DialogFragment;
import com.whatsapp.jid.UserJid;
import com.whatsapp.voipcalling.VoipActivityV2;
import com.whatsapp.voipcalling.VoipCallControlBottomSheet;

/* renamed from: X.2iw */
/* loaded from: classes2.dex */
public class C54552iw implements C0B5 {
    public final C0DS A00;

    public C54552iw(C0DS c0ds) {
        this.A00 = c0ds;
    }

    public void A00() {
        UserJid nullable;
        if (!(this instanceof C86963yq)) {
            this.A00.finish();
            return;
        }
        C86963yq c86963yq = (C86963yq) this;
        VoipActivityV2 voipActivityV2 = c86963yq.A01;
        voipActivityV2.A1e();
        Intent intent = c86963yq.A00;
        if (intent == null || (nullable = UserJid.getNullable(intent.getStringExtra("contact"))) == null) {
            return;
        }
        VoipActivityV2.A03(voipActivityV2, nullable);
        VoipCallControlBottomSheet voipCallControlBottomSheet = voipActivityV2.A1I;
        if (voipCallControlBottomSheet != null) {
            voipCallControlBottomSheet.A0f.A0H(nullable);
        }
    }

    public void A01(Intent intent) {
        if (!(this instanceof C86963yq)) {
            this.A00.setResult(-1, intent);
        } else {
            ((C86963yq) this).A00 = intent;
        }
    }

    @Override // X.C0B5
    public boolean AFE() {
        return this.A00.AFE();
    }

    @Override // X.C0B5
    public void ARS() {
        this.A00.ARS();
    }

    @Override // X.C0B5
    public void AUg(DialogFragment dialogFragment, String str) {
        this.A00.AUg(dialogFragment, str);
    }

    @Override // X.C0B5
    public void AUh(DialogFragment dialogFragment) {
        this.A00.AUh(dialogFragment);
    }

    @Override // X.C0B5
    public void AUj(int i) {
        this.A00.AUj(i);
    }

    @Override // X.C0B5
    public void AUk(int i, int i2, int i3, InterfaceC06590Tz interfaceC06590Tz, Object... objArr) {
        this.A00.AUk(i, i2, i3, interfaceC06590Tz, objArr);
    }

    @Override // X.C0B5
    public void AUl(int i, int i2, Object... objArr) {
        this.A00.AUl(i, i2, objArr);
    }

    @Override // X.C0B5
    public void AUm(String str) {
        this.A00.AUm(str);
    }

    @Override // X.C0B5
    public void AUr(int i, int i2) {
        this.A00.AUr(i, i2);
    }

    @Override // X.C0B5
    public void AVr(String str) {
        this.A00.AVr(str);
    }
}
