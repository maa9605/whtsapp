package X;

import android.content.Context;
import android.os.Build;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import com.google.android.search.verification.client.R;
import com.whatsapp.mentions.MentionableEntry;
import com.whatsapp.status.playback.widget.StatusEditText;
import com.whatsapp.util.Log;

/* renamed from: X.2LR */
/* loaded from: classes2.dex */
public class C2LR extends C2LS {
    public static final Editable.Factory A01 = new Editable.Factory() { // from class: X.2r5
        @Override // android.text.Editable.Factory
        public Editable newEditable(CharSequence charSequence) {
            return new SpannableStringBuilder(charSequence) { // from class: X.2r7
                @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
                public char charAt(int i) {
                    if (i >= 0 && i < length()) {
                        return super.charAt(i);
                    }
                    return ' ';
                }

                @Override // android.text.SpannableStringBuilder, android.text.GetChars
                public void getChars(int i, int i2, char[] cArr, int i3) {
                    int length;
                    if (i2 >= i && i <= (length = length()) && i2 <= length && i >= 0 && i2 >= 0) {
                        super.getChars(i, i2, cArr, i3);
                    }
                }
            };
        }
    };
    public InterfaceC58412r6 A00;

    public C2LR(Context context, AttributeSet attributeSet) {
        new C0MX(context, attributeSet) { // from class: X.2LS
            public boolean A00;

            {
                A00();
            }

            @Override // X.C0MY, X.AbstractC04840Ma
            public void A00() {
                if (!(this instanceof C2LQ)) {
                    if (this.A00) {
                        return;
                    }
                    this.A00 = true;
                    ((AbstractC07960aN) generatedComponent()).A0n((C2LR) this);
                    return;
                }
                C2LQ c2lq = (C2LQ) this;
                if (!(c2lq instanceof C2ZA)) {
                    if (c2lq.A00) {
                        return;
                    }
                    c2lq.A00 = true;
                    ((AbstractC07960aN) c2lq.generatedComponent()).A1z((MentionableEntry) c2lq);
                    return;
                }
                C2ZA c2za = (C2ZA) c2lq;
                if (c2za.A00) {
                    return;
                }
                c2za.A00 = true;
                ((AbstractC07960aN) c2za.generatedComponent()).A2i((StatusEditText) c2za);
            }
        };
        setEditableFactory(A01);
        setCustomSelectionActionModeCallback(new ActionMode.Callback() { // from class: X.2r4
            @Override // android.view.ActionMode.Callback
            public void onDestroyActionMode(ActionMode actionMode) {
            }

            @Override // android.view.ActionMode.Callback
            public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
                return false;
            }

            {
                C2LR.this = this;
            }

            @Override // android.view.ActionMode.Callback
            public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
                String str;
                C2LR c2lr = C2LR.this;
                int selectionStart = c2lr.getSelectionStart();
                int selectionEnd = c2lr.getSelectionEnd();
                if (selectionStart > selectionEnd) {
                    selectionEnd = selectionStart;
                    selectionStart = selectionEnd;
                }
                int itemId = menuItem.getItemId();
                if (itemId == R.id.bold) {
                    str = "*";
                } else if (itemId == R.id.italic) {
                    str = "_";
                } else if (itemId == R.id.strikethrough) {
                    str = "~";
                } else if (itemId != R.id.monospace) {
                    return false;
                } else {
                    str = "```";
                }
                Editable text = c2lr.getText();
                while (selectionEnd > selectionStart) {
                    int i = selectionEnd - 1;
                    if (!Character.isSpaceChar(text.charAt(i))) {
                        break;
                    }
                    selectionEnd = i;
                }
                if (selectionEnd < text.length()) {
                    char charAt = text.charAt(selectionEnd);
                    if (!Character.isSpaceChar(charAt) && charAt != '*' && charAt != '_' && charAt != '~') {
                        text.insert(selectionEnd, " ");
                    }
                }
                text.insert(selectionEnd, str);
                while (selectionStart < selectionEnd && Character.isSpaceChar(text.charAt(selectionStart))) {
                    selectionStart++;
                }
                if (selectionStart > 0) {
                    char charAt2 = text.charAt(selectionStart - 1);
                    if (!Character.isSpaceChar(charAt2) && charAt2 != '*' && charAt2 != '_' && charAt2 != '~') {
                        text.insert(selectionStart, " ");
                        selectionStart++;
                    }
                }
                text.insert(selectionStart, str);
                return true;
            }

            @Override // android.view.ActionMode.Callback
            public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
                MenuInflater menuInflater = actionMode.getMenuInflater();
                if (menuInflater != null) {
                    menuInflater.inflate(R.menu.text_style, menu);
                    return true;
                }
                Log.w("conversation-text-entry/action-mode-with-null-menu-inflater");
                return true;
            }
        });
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        InterfaceC58412r6 interfaceC58412r6 = this.A00;
        if (interfaceC58412r6 != null) {
            interfaceC58412r6.ALE(i, keyEvent);
        }
        return super.onKeyPreIme(i, keyEvent);
    }

    @Override // com.whatsapp.WaEditText, android.widget.TextView
    public boolean onTextContextMenuItem(int i) {
        if (Build.VERSION.SDK_INT >= 23 && i == 16908322) {
            i = 16908337;
        }
        return super.onTextContextMenuItem(i);
    }

    public void setInputEnterDone(boolean z) {
        setInputEnterAction(z ? 6 : 0);
    }

    public void setInputEnterSend(boolean z) {
        setInputEnterAction(z ? 4 : 0);
    }

    public void setOnKeyPreImeListener(InterfaceC58412r6 interfaceC58412r6) {
        this.A00 = interfaceC58412r6;
    }
}
