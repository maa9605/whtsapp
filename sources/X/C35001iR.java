package X;

import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.Conversation;
import com.whatsapp.WaEditText;

/* renamed from: X.1iR  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C35001iR implements C0O8 {
    public final /* synthetic */ Conversation A00;

    @Override // X.C0O8
    public boolean AGv(C0U0 c0u0, MenuItem menuItem) {
        return false;
    }

    @Override // X.C0O8
    public boolean ANE(C0U0 c0u0, Menu menu) {
        return false;
    }

    public C35001iR(Conversation conversation) {
        this.A00 = conversation;
    }

    @Override // X.C0O8
    public boolean AJ5(C0U0 c0u0, Menu menu) {
        Conversation conversation = this.A00;
        View inflate = LayoutInflater.from(conversation.A0c().A02()).inflate(R.layout.conversation_search_view, (ViewGroup) null, false);
        c0u0.A09(inflate);
        WaEditText waEditText = (WaEditText) inflate.findViewById(R.id.search_src_text);
        conversation.A11 = waEditText;
        if (waEditText == null) {
            return false;
        }
        waEditText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: X.1Fw
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                C35001iR c35001iR = C35001iR.this;
                if (z) {
                    c35001iR.A00.A2U();
                }
            }
        });
        conversation.A11.addTextChangedListener(conversation.A4U);
        conversation.A11.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: X.1Fu
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                C35001iR c35001iR = C35001iR.this;
                if (i == 3 || (keyEvent != null && keyEvent.getKeyCode() == 66 && keyEvent.getAction() == 0)) {
                    Conversation.A0R(c35001iR.A00, true);
                    return true;
                }
                return false;
            }
        });
        View A0D = C0AT.A0D(inflate, R.id.search_up);
        conversation.A0L = A0D;
        A0D.setOnClickListener(new View.OnClickListener() { // from class: X.1Fv
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Conversation.A0R(C35001iR.this.A00, true);
            }
        });
        View A0D2 = C0AT.A0D(inflate, R.id.search_down);
        conversation.A0J = A0D2;
        A0D2.setOnClickListener(new View.OnClickListener() { // from class: X.1Fx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Conversation.A0R(C35001iR.this.A00, false);
            }
        });
        conversation.A0M = C0AT.A0D(inflate, R.id.search_up_progress_bar);
        conversation.A0K = C0AT.A0D(inflate, R.id.search_down_progress_bar);
        conversation.A11.setText(conversation.A3y);
        conversation.A11.selectAll();
        conversation.A11.requestFocus();
        conversation.A11.setSelected(true);
        return true;
    }

    @Override // X.C0O8
    public void AJK(C0U0 c0u0) {
        c0u0.A09(null);
        Conversation conversation = this.A00;
        conversation.A0e = null;
        conversation.A3x = null;
        conversation.A41 = null;
        conversation.A24 = null;
        if (!C003101m.A0Y(conversation.A2D.A02()) && !conversation.A2S()) {
            conversation.A0E.setVisibility(0);
            conversation.A2f.requestFocus();
        } else {
            conversation.A2f.A01();
        }
        conversation.A1S.A06();
        conversation.A1m();
    }
}
