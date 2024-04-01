package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.widget.EditText;
import com.google.android.search.verification.client.R;
import com.whatsapp.registration.ChangeNumber;
import com.whatsapp.util.Log;

/* renamed from: X.3V6  reason: invalid class name */
/* loaded from: classes2.dex */
public class C3V6 extends Handler {
    public final /* synthetic */ ChangeNumber A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3V6(ChangeNumber changeNumber, Looper looper) {
        super(looper);
        this.A00 = changeNumber;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        EditText editText;
        EditText editText2;
        int i = message.what;
        if (i == 1) {
            Log.w("changenumber/check-number/match");
            ChangeNumber changeNumber = this.A00;
            changeNumber.A0P.removeMessages(4);
            changeNumber.A0N.AS1(new RunnableEBaseShape9S0100000_I1_1(this, 11));
            if (!ChangeNumber.A0T.equals(C26L.A0O)) {
                C002701i.A18(changeNumber, 1);
                C002701i.A19(changeNumber, 2);
                C3VC c3vc = changeNumber.A0I;
                if (c3vc == null || (editText = c3vc.A02) == null) {
                    return;
                }
                editText.requestFocus();
                return;
            }
            changeNumber.A1S();
        } else if (i == 2) {
            Log.w("changenumber/check-number/mismatch");
            ChangeNumber changeNumber2 = this.A00;
            changeNumber2.A0P.removeMessages(4);
            C002701i.A18(changeNumber2, 1);
            changeNumber2.AUj(R.string.delete_account_mismatch);
            C3VC c3vc2 = changeNumber2.A0I;
            if (c3vc2 == null || (editText2 = c3vc2.A03) == null) {
                return;
            }
            editText2.requestFocus();
        } else if (i == 3) {
            Log.e("changenumber/error");
            ChangeNumber changeNumber3 = this.A00;
            C002701i.A18(changeNumber3, 1);
            C002701i.A19(changeNumber3, 109);
        } else if (i == 4) {
            Log.e("changenumber/timeout");
            ChangeNumber changeNumber4 = this.A00;
            changeNumber4.A0P.removeMessages(4);
            C002701i.A18(changeNumber4, 1);
            C002701i.A19(changeNumber4, 109);
        }
    }
}
