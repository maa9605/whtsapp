package X;

import android.os.SystemClock;
import android.view.View;
import com.facebook.redex.ViewOnClickEmptyBase;
import com.google.android.search.verification.client.R;
import com.whatsapp.QuickContactActivity;
import com.whatsapp.jid.UserJid;
import com.whatsapp.voipcalling.CallsFragment;

/* renamed from: X.2jS  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class View$OnClickListenerC54852jS extends ViewOnClickEmptyBase implements View.OnClickListener {
    public long A00;
    public InterfaceC53232cA A01;
    public AbstractC53222c9 A02;
    public CallsFragment A03;

    public View$OnClickListenerC54852jS(CallsFragment callsFragment, InterfaceC53232cA interfaceC53232cA, AbstractC53222c9 abstractC53222c9) {
        this.A03 = callsFragment;
        this.A01 = interfaceC53232cA;
        this.A02 = abstractC53222c9;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        View findViewById;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        CallsFragment callsFragment = this.A03;
        if (callsFragment.A01 != null) {
            InterfaceC53232cA interfaceC53232cA = this.A01;
            if (interfaceC53232cA.AAh() == 2) {
                callsFragment.A16(((C53252cC) interfaceC53232cA).A00, (C53242cB) this.A02);
                return;
            }
        }
        if (elapsedRealtime - this.A00 <= 1000) {
            return;
        }
        this.A00 = elapsedRealtime;
        if (this.A01.AAh() == 2) {
            findViewById = ((C53242cB) this.A02).A01.findViewById(R.id.contact_photo);
        } else {
            findViewById = ((C54842jR) this.A02).A00.findViewById(R.id.contact_photo);
        }
        UserJid AAk = this.A01.AAk();
        if (AAk == null) {
            return;
        }
        QuickContactActivity.A00(this.A03.A09(), findViewById, AAk, C0AT.A0G(findViewById));
    }
}
