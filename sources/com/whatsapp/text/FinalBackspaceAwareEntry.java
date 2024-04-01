package com.whatsapp.text;

import X.AbstractC461625j;
import X.C0MX;
import X.C2JT;
import X.C80793nr;
import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.widget.TextView;
import com.whatsapp.jid.UserJid;
import com.whatsapp.search.SearchViewModel;
import com.whatsapp.search.views.TokenizedSearchInput;
import com.whatsapp.text.FinalBackspaceAwareEntry;
import java.util.List;

/* loaded from: classes2.dex */
public class FinalBackspaceAwareEntry extends AbstractC461625j {
    public static final char A03 = "\u200b".charAt(0);
    public TextView.BufferType A00;
    public List A01;
    public boolean A02;

    public FinalBackspaceAwareEntry(final Context context, final AttributeSet attributeSet) {
        new C0MX(context, attributeSet) { // from class: X.25j
            public boolean A00;

            {
                A00();
            }

            @Override // X.C0MY, X.AbstractC04840Ma
            public void A00() {
                if (this.A00) {
                    return;
                }
                this.A00 = true;
                ((AbstractC07960aN) generatedComponent()).A2n((FinalBackspaceAwareEntry) this);
            }
        };
        this.A02 = false;
        this.A00 = TextView.BufferType.EDITABLE;
        if (!A00(getText())) {
            A07(getText());
        }
        addTextChangedListener(new C2JT() { // from class: X.3s4
            @Override // X.C2JT, android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                if (editable == null) {
                    return;
                }
                FinalBackspaceAwareEntry finalBackspaceAwareEntry = FinalBackspaceAwareEntry.this;
                if (!FinalBackspaceAwareEntry.A00(editable.toString()) && !finalBackspaceAwareEntry.A02) {
                    List<C80793nr> list = finalBackspaceAwareEntry.A01;
                    if (list != null) {
                        for (C80793nr c80793nr : list) {
                            TokenizedSearchInput tokenizedSearchInput = c80793nr.A00;
                            SearchViewModel searchViewModel = tokenizedSearchInput.A0C;
                            if (searchViewModel != null) {
                                UserJid A06 = searchViewModel.A06();
                                int A032 = tokenizedSearchInput.A0C.A03();
                                int i = tokenizedSearchInput.A00;
                                if (i == 1) {
                                    TokenizedSearchInput.A00(tokenizedSearchInput, tokenizedSearchInput.A0N);
                                } else if (i == 2) {
                                    TokenizedSearchInput.A00(tokenizedSearchInput, tokenizedSearchInput.A0M);
                                } else if (i == 0) {
                                    if (A06 != null) {
                                        TokenizedSearchInput.setFocus(tokenizedSearchInput, 2);
                                    } else if (A032 != 0) {
                                        TokenizedSearchInput.setFocus(tokenizedSearchInput, 1);
                                    }
                                }
                            }
                        }
                    }
                    finalBackspaceAwareEntry.A07(editable);
                }
                List<C80793nr> list2 = finalBackspaceAwareEntry.A01;
                if (list2 != null) {
                    for (C80793nr c80793nr2 : list2) {
                        String obj = finalBackspaceAwareEntry.A06(editable).toString();
                        SearchViewModel searchViewModel2 = c80793nr2.A00.A0C;
                        if (searchViewModel2 != null && obj != null) {
                            searchViewModel2.A0J(obj);
                        }
                    }
                }
            }
        });
    }

    public static final boolean A00(CharSequence charSequence) {
        return !TextUtils.isEmpty(charSequence) && charSequence.charAt(0) == A03;
    }

    @Override // X.C0MX
    public boolean A04() {
        return TextUtils.isEmpty(A06(getText()));
    }

    public final int A05(int i) {
        return Math.max(0, Math.min(i, TextUtils.isEmpty(getText()) ? 0 : getText().length()));
    }

    public final Editable A06(Editable editable) {
        if (A00(editable)) {
            Editable newEditable = Editable.Factory.getInstance().newEditable(editable);
            newEditable.replace(0, A00(newEditable) ? 1 : 0, "", 0, 0);
            return newEditable;
        }
        return editable;
    }

    public final void A07(Editable editable) {
        Editable editable2;
        this.A02 = true;
        if (editable != null) {
            editable2 = Editable.Factory.getInstance().newEditable(editable);
            editable2.replace(0, 0, "\u200b", 0, 1);
        } else {
            editable2 = null;
        }
        setText(editable2, this.A00);
        this.A02 = false;
    }

    public /* synthetic */ void A08(String str) {
        Editable A06 = A06(getText());
        if (str == null || A06 == null || str.equals(A06.toString())) {
            return;
        }
        setTextWithBsPrefix(str);
        setSelection(str.length());
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        SearchViewModel searchViewModel;
        List<C80793nr> list = this.A01;
        if (list != null) {
            for (C80793nr c80793nr : list) {
                if (keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1 && (searchViewModel = c80793nr.A00.A0C) != null) {
                    searchViewModel.A0L(false);
                }
            }
        }
        return super.onKeyPreIme(i, keyEvent);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // android.widget.TextView
    public void onSelectionChanged(int i, int i2) {
        super.onSelectionChanged(i, i2);
        int min = Math.min(i, i2);
        int max = Math.max(i, i2);
        ?? A00 = A00(getText());
        if (min < A00) {
            setSelection(A05(Math.max(min, A00 == true ? 1 : 0)), A05(max));
        }
    }

    @Override // android.widget.EditText
    public void setSelection(int i) {
        super.setSelection(A05(i + (A00(getText()) ? 1 : 0)));
    }

    private void setTextWithBsPrefix(String str) {
        StringBuilder sb = new StringBuilder("\u200b");
        sb.append(str);
        setText(sb.toString());
    }
}
