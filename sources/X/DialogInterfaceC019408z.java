package X;

import android.content.Context;
import android.content.DialogInterface;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.widget.Button;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.google.android.search.verification.client.R;

/* renamed from: X.08z */
/* loaded from: classes.dex */
public class DialogInterfaceC019408z extends AnonymousClass090 implements DialogInterface {
    public final C10580gJ A00;

    public DialogInterfaceC019408z(Context context, int i) {
        super(context, A00(context, i));
        this.A00 = new C10580gJ(getContext(), this, getWindow());
    }

    public static int A00(Context context, int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    public Button A02(int i) {
        C10580gJ c10580gJ = this.A00;
        if (c10580gJ != null) {
            if (i != -3) {
                if (i != -2) {
                    if (i == -1) {
                        return c10580gJ.A0I;
                    }
                    return null;
                }
                return c10580gJ.A0G;
            }
            return c10580gJ.A0H;
        }
        throw null;
    }

    public void A03(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        this.A00.A04(i, charSequence, onClickListener);
    }

    public void A04(CharSequence charSequence) {
        C10580gJ c10580gJ = this.A00;
        c10580gJ.A0S = charSequence;
        TextView textView = c10580gJ.A0M;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:169:0x0052, code lost:
        if (r11 != null) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0059, code lost:
        if (X.C10580gJ.A03(r11) == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x0164, code lost:
        if (r12.getVisibility() == 8) goto L131;
     */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x026a  */
    @Override // X.AnonymousClass090, android.app.Dialog
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onCreate(android.os.Bundle r17) {
        /*
            Method dump skipped, instructions count: 871
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DialogInterfaceC019408z.onCreate(android.os.Bundle):void");
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.A00.A0O;
        if (nestedScrollView == null || !nestedScrollView.A0E(keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.A00.A0O;
        if (nestedScrollView == null || !nestedScrollView.A0E(keyEvent)) {
            return super.onKeyUp(i, keyEvent);
        }
        return true;
    }

    @Override // X.AnonymousClass090, android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        C10580gJ c10580gJ = this.A00;
        c10580gJ.A0T = charSequence;
        TextView textView = c10580gJ.A0N;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}
