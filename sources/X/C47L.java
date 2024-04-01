package X;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.search.verification.client.R;
import com.whatsapp.CodeInputField;

/* renamed from: X.47L  reason: invalid class name */
/* loaded from: classes3.dex */
public final class C47L extends AbstractC30911bN {
    @Override // X.AbstractC30911bN
    public void A0B(View view, AnonymousClass087 anonymousClass087, C016807u c016807u, Object obj) {
    }

    public C47L(C016807u c016807u, AnonymousClass087 anonymousClass087) {
        super(c016807u, anonymousClass087);
    }

    public static void A04(AnonymousClass087 anonymousClass087, CodeInputField codeInputField) {
        ((C892046c) anonymousClass087.A02).A04.A02(codeInputField);
    }

    @Override // X.AbstractC30911bN, X.AbstractC016307p
    public Object A07(Context context) {
        return View.inflate(context, R.layout.wa_bloks_code_input, null);
    }

    @Override // X.AbstractC30911bN
    public View A08(Context context) {
        return View.inflate(context, R.layout.wa_bloks_code_input, null);
    }

    @Override // X.AbstractC30911bN
    public void A09(View view, AnonymousClass087 anonymousClass087, C016807u c016807u, Object obj) {
        CodeInputField codeInputField = (CodeInputField) view.findViewById(R.id.code);
        codeInputField.removeTextChangedListener(codeInputField.A05);
        if (codeInputField.getTag() != null) {
            codeInputField.removeCallbacks((Runnable) codeInputField.getTag());
        }
        ((ViewGroup) view).removeAllViews();
        C018308n.A00(anonymousClass087.A00).getWindow().clearFlags(8192);
    }

    @Override // X.AbstractC30911bN
    public void A0A(View view, AnonymousClass087 anonymousClass087, C016807u c016807u, Object obj) {
        view.setFocusable(false);
        Context context = anonymousClass087.A00;
        C018308n.A00(context).getWindow().setFlags(8192, 8192);
        CodeInputField codeInputField = (CodeInputField) view.findViewById(R.id.code);
        if (codeInputField == null) {
            String str = (String) c016807u.A00.A00(AnonymousClass463.A08);
            if (str != null) {
                boolean equals = str.equals("fb_pay");
                int i = R.layout.code_input;
                if (equals) {
                    i = R.layout.code_input_fb_pay;
                }
                codeInputField = (CodeInputField) View.inflate(context, i, null);
            } else {
                codeInputField = (CodeInputField) View.inflate(context, R.layout.code_input, null);
            }
            codeInputField.setCustomSelectionActionModeCallback(new ActionMode.Callback() { // from class: X.45q
                @Override // android.view.ActionMode.Callback
                public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
                    return false;
                }

                @Override // android.view.ActionMode.Callback
                public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
                    return false;
                }

                @Override // android.view.ActionMode.Callback
                public void onDestroyActionMode(ActionMode actionMode) {
                }

                @Override // android.view.ActionMode.Callback
                public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
                    return false;
                }
            });
            ((ViewGroup) view).addView(codeInputField);
            C45Q.A0J(codeInputField, anonymousClass087, c016807u);
        }
        String str2 = (String) c016807u.A00.A00(AnonymousClass463.A05);
        if (str2 != null) {
            try {
                codeInputField.setGravity(C08i.A05(str2));
            } catch (C018208m e) {
                throw new RuntimeException(e);
            }
        }
        AnonymousClass084 anonymousClass084 = AnonymousClass463.A01;
        String str3 = (String) c016807u.A00.A00(anonymousClass084);
        if (str3 != null && str3.equals("error")) {
            codeInputField.setErrorState(true);
            codeInputField.A04();
            c016807u.A00.A02(AnonymousClass463.A06, "");
            c016807u.A00.A02(anonymousClass084, "no_error");
            codeInputField.removeTextChangedListener(codeInputField.A05);
            C45Q.A0J(codeInputField, anonymousClass087, c016807u);
        } else {
            codeInputField.setErrorState(false);
        }
        boolean z = !Boolean.FALSE.equals(Boolean.valueOf(c016807u.A8Z(AnonymousClass463.A00, true)));
        codeInputField.setEnabled(z);
        codeInputField.setCursorVisible(false);
        String str4 = (String) c016807u.A00.A00(AnonymousClass463.A06);
        if (str4 != null && !str4.equals(codeInputField.getCode())) {
            codeInputField.setCode(str4);
        }
        if (z) {
            codeInputField.requestFocus();
            Runnable runnable = (Runnable) codeInputField.getTag();
            if (runnable == null) {
                runnable = new RunnableC56722nt(anonymousClass087, codeInputField);
                codeInputField.setTag(runnable);
            }
            codeInputField.postDelayed(runnable, 0L);
            return;
        }
        codeInputField.A04();
    }
}
