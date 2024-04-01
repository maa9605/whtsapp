package com.whatsapp.mentions;

import X.AbstractC04890Mh;
import X.AbstractC15100o5;
import X.AnonymousClass029;
import X.C000200d;
import X.C003101m;
import X.C011005l;
import X.C011305p;
import X.C02160Ac;
import X.C02980Dr;
import X.C02E;
import X.C02L;
import X.C02M;
import X.C02O;
import X.C04250Jl;
import X.C05W;
import X.C07D;
import X.C0C8;
import X.C0D7;
import X.C0HS;
import X.C26761Ko;
import X.C2LQ;
import X.C2LT;
import X.C2LU;
import X.C2Y8;
import X.C31S;
import X.C31U;
import X.C54192iG;
import X.C68113Ic;
import X.C68123Id;
import X.C68143If;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.graphics.Canvas;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.core.view.inputmethod.EditorInfoCompat;
import androidx.core.view.inputmethod.InputConnectionCompat;
import androidx.core.view.inputmethod.InputContentInfoCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.search.verification.client.R;
import com.whatsapp.jid.UserJid;
import com.whatsapp.mentions.MentionPickerView;
import com.whatsapp.mentions.MentionableEntry;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes2.dex */
public class MentionableEntry extends C2LQ implements C2LT, C2LU {
    public static final String[] A0L = C26761Ko.A01;
    public int A00;
    public int A01;
    public int A02;
    public Bundle A03;
    public View A04;
    public View A05;
    public ViewGroup A06;
    public C05W A07;
    public C02E A08;
    public C0C8 A09;
    public C011005l A0A;
    public C2LT A0B;
    public MentionPickerView A0C;
    public C68113Ic A0D;
    public C31S A0E;
    public C02980Dr A0F;
    public C02O A0G;
    public boolean A0H;
    public boolean A0I;
    public final TextWatcher A0J;
    public final C54192iG A0K;

    public MentionableEntry(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A0K = new C54192iG();
        this.A0J = new TextWatcher() { // from class: X.31R
            public int A00;
            public boolean A01;
            public C68123Id[] A02;

            {
                MentionableEntry.this = this;
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                if (this.A00 > 0) {
                    MentionableEntry mentionableEntry = MentionableEntry.this;
                    C68123Id[] c68123IdArr = this.A02;
                    boolean z = this.A01;
                    if (mentionableEntry == null) {
                        throw null;
                    }
                    int i = 0;
                    if (!z) {
                        C68123Id[] c68123IdArr2 = (C68123Id[]) mentionableEntry.getEditableText().getSpans(mentionableEntry.getSelectionStart(), mentionableEntry.getSelectionEnd(), C68123Id.class);
                        mentionableEntry.A0B(mentionableEntry.A0D);
                        mentionableEntry.A0D = null;
                        int length = c68123IdArr2.length;
                        while (i < length) {
                            C68123Id c68123Id = c68123IdArr2[i];
                            mentionableEntry.A0B(c68123Id.A00);
                            mentionableEntry.A0B(c68123Id);
                            i++;
                        }
                    } else {
                        int length2 = c68123IdArr.length;
                        while (i < length2) {
                            C68123Id c68123Id2 = c68123IdArr[i];
                            int spanStart = editable.getSpanStart(c68123Id2.A00);
                            int spanEnd = editable.getSpanEnd(c68123Id2);
                            if (spanStart != -1 && spanEnd != -1) {
                                mentionableEntry.A0B(c68123Id2.A00);
                                mentionableEntry.A0B(c68123Id2);
                                editable.delete(spanStart, spanEnd);
                            }
                            i++;
                        }
                    }
                }
                MentionableEntry.this.A08(editable);
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                MentionableEntry mentionableEntry = MentionableEntry.this;
                int selectionEnd = mentionableEntry.getSelectionEnd();
                this.A02 = (C68123Id[]) mentionableEntry.getEditableText().getSpans(selectionEnd, selectionEnd, C68123Id.class);
                this.A01 = mentionableEntry.getSelectionStart() == mentionableEntry.getSelectionEnd();
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                this.A00 = i2;
            }
        };
    }

    public static final int A00(int i, Editable editable) {
        C68123Id[] c68123IdArr;
        for (C68123Id c68123Id : (C68123Id[]) editable.getSpans(i, i, C68123Id.class)) {
            int spanStart = editable.getSpanStart(c68123Id) - 1;
            int spanEnd = editable.getSpanEnd(c68123Id);
            int i2 = i;
            i = spanEnd;
            if (i2 <= ((spanStart + spanEnd) >> 1)) {
                i = spanStart;
            }
        }
        return i;
    }

    public final int A05(Editable editable, int i) {
        int lastIndexOf = editable.toString().substring(i, getSelectionEnd()).lastIndexOf("@");
        for (C68113Ic c68113Ic : (C68113Ic[]) editable.getSpans(lastIndexOf, lastIndexOf + 1, C68113Ic.class)) {
            if (c68113Ic.A00) {
                return -1;
            }
        }
        return lastIndexOf;
    }

    public final String A06(int i, int i2) {
        C68123Id[] c68123IdArr;
        Editable newEditable = Editable.Factory.getInstance().newEditable(getText().subSequence(i, i2));
        for (C68123Id c68123Id : (C68123Id[]) newEditable.getSpans(0, newEditable.length(), C68123Id.class)) {
            newEditable.replace(newEditable.getSpanStart(c68123Id) - 1, newEditable.getSpanEnd(c68123Id), c68123Id.A01);
        }
        return newEditable.toString();
    }

    public void A07() {
        removeTextChangedListener(this.A0J);
        setText((String) null);
        setCursorVisible(false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0045, code lost:
        if (r1 != '_') goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A08(android.text.Editable r8) {
        /*
            r7 = this;
            r0 = 0
            int r3 = r7.A05(r8, r0)
            int r2 = r3 + 1
            int r1 = r7.getSelectionEnd()
            java.lang.Class<X.3Id> r0 = X.C68123Id.class
            java.lang.Object[] r6 = r8.getSpans(r2, r1, r0)
            X.3Id[] r6 = (X.C68123Id[]) r6
            int r5 = r6.length
            if (r5 <= 0) goto L33
            r4 = 0
            r3 = 0
        L18:
            if (r4 >= r5) goto L2f
            r2 = r6[r4]
            int r1 = r8.getSpanEnd(r2)
            if (r1 <= r3) goto L2c
            int r0 = r7.getSelectionEnd()
            if (r1 > r0) goto L2c
            int r3 = r8.getSpanEnd(r2)
        L2c:
            int r4 = r4 + 1
            goto L18
        L2f:
            int r3 = r7.A05(r8, r3)
        L33:
            if (r3 < 0) goto L47
            if (r3 == 0) goto L51
            int r0 = r3 + (-1)
            char r1 = r8.charAt(r0)
            boolean r0 = java.lang.Character.isLetterOrDigit(r1)
            if (r0 != 0) goto L47
            r0 = 95
            if (r1 != r0) goto L51
        L47:
            X.3Ic r0 = r7.A0D
            r7.A0B(r0)
            r0 = 0
            r7.A0D(r0)
        L50:
            return
        L51:
            java.lang.String r2 = r8.toString()
            int r1 = r3 + 1
            int r0 = r7.getSelectionEnd()
            java.lang.String r0 = r2.substring(r1, r0)
            r7.A0D(r0)
            boolean r0 = r7.A0I
            if (r0 == 0) goto L50
            r7.A09(r8, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.mentions.MentionableEntry.A08(android.text.Editable):void");
    }

    public final void A09(Editable editable, int i) {
        int i2 = i + 1;
        if (((C68113Ic[]) editable.getSpans(i, i2, C68113Ic.class)).length < 1) {
            A0B(this.A0D);
            C68113Ic c68113Ic = new C68113Ic(this.A00, false);
            this.A0D = c68113Ic;
            editable.setSpan(c68113Ic, i, i2, 33);
        }
    }

    public final void A0A(SpannableStringBuilder spannableStringBuilder, Collection collection, boolean z) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            UserJid userJid = (UserJid) it.next();
            if (userJid != null) {
                C02980Dr c02980Dr = this.A0F;
                if (c02980Dr != null) {
                    C05W c05w = this.A07;
                    if (c05w != null) {
                        String A02 = c02980Dr.A02(c05w.A0A(userJid));
                        String A0r = AnonymousClass029.A0r(userJid);
                        int indexOf = TextUtils.indexOf(spannableStringBuilder, A0r);
                        if (indexOf < 0) {
                            StringBuilder sb = new StringBuilder("unable to set mention for ");
                            sb.append(userJid);
                            sb.append(" in ");
                            sb.append((Object) spannableStringBuilder);
                            Log.w(sb.toString());
                        } else {
                            do {
                                spannableStringBuilder.replace(indexOf, A0r.length() + indexOf, C000200d.A0H("@", A02));
                                if (z) {
                                    C68113Ic c68113Ic = new C68113Ic(this.A00, true);
                                    int i = indexOf + 1;
                                    spannableStringBuilder.setSpan(c68113Ic, indexOf, i, 33);
                                    spannableStringBuilder.setSpan(new C68123Id(this.A01, A0r, c68113Ic), i, A02.length() + i, 33);
                                }
                                indexOf = TextUtils.indexOf(spannableStringBuilder, A0r, indexOf + 1);
                            } while (indexOf >= 0);
                        }
                    } else {
                        throw null;
                    }
                } else {
                    throw null;
                }
            }
        }
    }

    public final void A0B(ForegroundColorSpan foregroundColorSpan) {
        if (foregroundColorSpan != null) {
            getText().removeSpan(foregroundColorSpan);
        }
    }

    public void A0C(ViewGroup viewGroup, C011005l c011005l, boolean z, boolean z2, boolean z3) {
        this.A0A = c011005l;
        addTextChangedListener(this.A0J);
        this.A01 = C02160Ac.A00(getContext(), R.color.link_color);
        this.A00 = C02160Ac.A00(getContext(), R.color.mention_annotation_on_white);
        A08(getText());
        this.A06 = viewGroup;
        Bundle bundle = new Bundle();
        this.A03 = bundle;
        bundle.putString("ARG_GID", C003101m.A07(c011005l));
        this.A03.putBoolean("ARG_IS_DARK_THEME", z);
        this.A03.putBoolean("ARG_HIDE_END_DIVIDER", z2);
        this.A03.putBoolean("ARG_WITH_BACKGROUND", z3);
    }

    public final void A0D(String str) {
        if (this.A06 == null) {
            return;
        }
        MentionPickerView mentionPickerView = this.A0C;
        if (str != null) {
            if (mentionPickerView == null) {
                MentionPickerView mentionPickerView2 = (MentionPickerView) LayoutInflater.from(getContext()).inflate(R.layout.mentions_list, this.A06, false);
                this.A0C = mentionPickerView2;
                this.A06.addView(mentionPickerView2);
                final MentionPickerView mentionPickerView3 = this.A0C;
                Bundle bundle = this.A03;
                if (mentionPickerView3 != null) {
                    C011005l A04 = C011005l.A04(bundle.getString("ARG_GID"));
                    boolean z = bundle.getBoolean("ARG_IS_DARK_THEME");
                    boolean z2 = bundle.getBoolean("ARG_HIDE_END_DIVIDER");
                    boolean z3 = bundle.getBoolean("ARG_WITH_BACKGROUND");
                    mentionPickerView3.A08 = A04;
                    RecyclerView recyclerView = (RecyclerView) mentionPickerView3.findViewById(R.id.list);
                    mentionPickerView3.A00 = recyclerView;
                    mentionPickerView3.getContext();
                    recyclerView.setLayoutManager(new LinearLayoutManager());
                    mentionPickerView3.setVisibility(8);
                    if (z3) {
                        if (!z) {
                            mentionPickerView3.setBackgroundResource(R.drawable.ib_new_expanded_top);
                        } else {
                            mentionPickerView3.setBackgroundColor(C02160Ac.A00(mentionPickerView3.getContext(), R.color.mention_picker_dark_theme_background));
                        }
                    }
                    C02L c02l = mentionPickerView3.A01;
                    if (c02l != null) {
                        c02l.A05();
                        mentionPickerView3.A09 = c02l.A03;
                        mentionPickerView3.A0C = new C68143If(mentionPickerView3.getContext(), mentionPickerView3.A0B, mentionPickerView3.A01, mentionPickerView3.A04, mentionPickerView3.A03, mentionPickerView3.A05, mentionPickerView3.A0D, this, z, z2);
                        mentionPickerView3.A05();
                        ((AbstractC04890Mh) mentionPickerView3.A0C).A01.registerObserver(new AbstractC15100o5() { // from class: X.3Ia
                            @Override // X.AbstractC15100o5
                            public void A00() {
                                MentionPickerView mentionPickerView4 = mentionPickerView3;
                                mentionPickerView4.A04(mentionPickerView4.A0C.A0C(), mentionPickerView4.getResources().getDimensionPixelSize(R.dimen.mention_picker_row_height));
                            }
                        });
                        mentionPickerView3.A00.setAdapter(mentionPickerView3.A0C);
                        View view = this.A05;
                        if (view != null) {
                            this.A0C.setAnchorWidthView(view);
                        }
                        View view2 = this.A04;
                        if (view2 != null) {
                            ((C2Y8) this.A0C).A03 = view2;
                        }
                        mentionPickerView = this.A0C;
                        mentionPickerView.A0A = this;
                    } else {
                        throw null;
                    }
                } else {
                    throw null;
                }
            }
            if (mentionPickerView.A0E) {
                mentionPickerView.A0C.getFilter().filter(str);
                return;
            }
            new C0HS(mentionPickerView.A06, mentionPickerView.A09, str) { // from class: X.3Ib
                public final C0C9 A00;
                public final UserJid A01;
                public final CharSequence A02;

                {
                    this.A00 = r2;
                    this.A01 = r3;
                    this.A02 = str;
                }

                @Override // X.C0HS
                public Object A07(Object[] objArr) {
                    List list;
                    C011005l[] c011005lArr = (C011005l[]) objArr;
                    HashSet hashSet = new HashSet();
                    C0C9 c0c9 = this.A00;
                    Cursor cursor = c0c9.A08(c011005lArr[0], 1L, 15, -1L).A00;
                    try {
                        cursor.moveToPrevious();
                        for (int i = 0; cursor.moveToNext() && i < 15; i++) {
                            AnonymousClass092 A03 = c0c9.A0H.A03(cursor, c011005lArr[0]);
                            if (A03 != null) {
                                if (!(A03 instanceof C04300Jq) && (list = A03.A0c) != null && list.contains(this.A01)) {
                                    hashSet.add((UserJid) A03.A0A());
                                }
                            } else {
                                throw null;
                            }
                        }
                        cursor.close();
                        return hashSet;
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            if (cursor != null) {
                                try {
                                    cursor.close();
                                } catch (Throwable unused) {
                                }
                            }
                            throw th2;
                        }
                    }
                }

                @Override // X.C0HS
                public void A09(Object obj) {
                    Set set = (Set) obj;
                    MentionPickerView mentionPickerView4 = MentionPickerView.this;
                    mentionPickerView4.A0E = true;
                    C68143If c68143If = mentionPickerView4.A0C;
                    if (c68143If.A04 == null) {
                        c68143If.A04 = new C31W(c68143If.A0B, c68143If.A0C);
                    }
                    c68143If.A04.A00 = set;
                    mentionPickerView4.A0C.getFilter().filter(this.A02);
                }
            }.A02.execute(mentionPickerView.A08);
        } else if (mentionPickerView == null) {
        } else {
            mentionPickerView.A0C.getFilter().filter(null);
        }
    }

    public final void A0E(boolean z) {
        boolean z2 = this.A0H;
        if (z2 == z) {
            return;
        }
        if (!z2) {
            this.A02 = getInputType();
        }
        this.A0H = z;
        setInputType(z ? 147457 : this.A02);
        int selectionStart = getSelectionStart();
        int selectionEnd = getSelectionEnd();
        if (selectionStart == -1 || selectionEnd == -1) {
            return;
        }
        setSelection(selectionStart, selectionEnd);
    }

    @Override // X.C2LT
    public void AII(boolean z) {
        int A05;
        this.A0I = z;
        C2LT c2lt = this.A0B;
        if (c2lt != null) {
            c2lt.AII(z);
        }
        if (z && (A05 = A05(getEditableText(), 0)) >= 0) {
            A09(getEditableText(), A05);
            return;
        }
        A0B(this.A0D);
        this.A0D = null;
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.A0K.A00();
    }

    public List getMentions() {
        HashSet hashSet = new HashSet();
        for (C68123Id c68123Id : (C68123Id[]) getText().getSpans(0, getText().length(), C68123Id.class)) {
            try {
                hashSet.add(UserJid.getFromIdentifier(c68123Id.A01.substring(1)));
            } catch (C011305p unused) {
            }
        }
        return new ArrayList(hashSet);
    }

    public String getStringText() {
        return A06(0, getText().length());
    }

    @Override // X.C0MX, com.whatsapp.WaEditText, X.C04850Mb, android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        String[] strArr = A0L;
        if (strArr.length > 0) {
            EditorInfoCompat.setContentMimeTypes(editorInfo, strArr);
            return InputConnectionCompat.createWrapper(onCreateInputConnection, editorInfo, new InputConnectionCompat.OnCommitContentListener() { // from class: X.3IZ
                {
                    MentionableEntry.this = this;
                }

                @Override // androidx.core.view.inputmethod.InputConnectionCompat.OnCommitContentListener
                public final boolean onCommitContent(InputContentInfoCompat inputContentInfoCompat, int i, Bundle bundle) {
                    C31S c31s = MentionableEntry.this.A0E;
                    if (c31s == null) {
                        Log.e("mentionable/entry/no on commit content listener");
                        return false;
                    }
                    return c31s.onCommitContent(inputContentInfoCompat, i, bundle);
                }
            });
        }
        return onCreateInputConnection;
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        C31U c31u = (C31U) parcelable;
        super.onRestoreInstanceState(c31u.getSuperState());
        String str = c31u.A00;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String str2 = c31u.A01;
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        int selectionStart = getSelectionStart();
        int selectionEnd = getSelectionEnd();
        if (str2 != null) {
            setMentionableText(str2, AnonymousClass029.A0y(str));
            setSelection(selectionStart, selectionEnd);
            return;
        }
        throw null;
    }

    @Override // android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        if (onSaveInstanceState != null) {
            return new C31U(onSaveInstanceState, getStringText(), AnonymousClass029.A0v(getMentions()));
        }
        throw null;
    }

    @Override // android.widget.TextView
    public void onSelectionChanged(int i, int i2) {
        super.onSelectionChanged(i, i2);
        Editable editableText = getEditableText();
        if (TextUtils.isEmpty(editableText)) {
            return;
        }
        setSelection(A00(i, editableText), A00(i2, editableText));
    }

    @Override // X.C2LR, com.whatsapp.WaEditText, android.widget.TextView
    public boolean onTextContextMenuItem(int i) {
        int i2;
        CharSequence charSequence;
        int length = getText().length();
        if (isFocused()) {
            int selectionStart = getSelectionStart();
            int selectionEnd = getSelectionEnd();
            i2 = Math.max(0, Math.min(selectionStart, selectionEnd));
            length = Math.max(0, Math.max(selectionStart, selectionEnd));
        } else {
            i2 = 0;
        }
        if (i == 16908322) {
            if (this.A0A != null) {
                C02E c02e = this.A08;
                if (c02e != null) {
                    ClipboardManager A06 = c02e.A06();
                    if (A06 == null) {
                        Log.w("mentionableentry/on-text-context-menu-item cm=null");
                        return super.onTextContextMenuItem(i);
                    }
                    ClipData primaryClip = A06.getPrimaryClip();
                    if (primaryClip != null && primaryClip.getItemCount() != 0) {
                        ClipData.Item itemAt = primaryClip.getItemAt(0);
                        if (itemAt != null) {
                            charSequence = itemAt.getText();
                        } else {
                            charSequence = "";
                        }
                        SharedPreferences A01 = this.A0G.A01(C02M.A02);
                        String string = A01.getString("copied_message", "");
                        String string2 = A01.getString("copied_message_jids", "");
                        String string3 = A01.getString("copied_message_without_mentions", "");
                        if (!TextUtils.isEmpty(charSequence) && TextUtils.equals(charSequence, string) && !TextUtils.isEmpty(string2) && !TextUtils.isEmpty(string3)) {
                            List A0y = AnonymousClass029.A0y(string2);
                            HashSet hashSet = new HashSet(A0y);
                            HashSet hashSet2 = new HashSet(A0y);
                            C011005l c011005l = this.A0A;
                            if (c011005l != null) {
                                C0C8 c0c8 = this.A09;
                                if (c0c8 != null) {
                                    C07D A05 = c0c8.A01(c011005l).A05();
                                    HashSet hashSet3 = new HashSet();
                                    Iterator it = A05.iterator();
                                    while (true) {
                                        C04250Jl c04250Jl = (C04250Jl) it;
                                        if (!c04250Jl.hasNext()) {
                                            break;
                                        }
                                        hashSet3.add(((C0D7) c04250Jl.next()).A03);
                                    }
                                    hashSet.retainAll(hashSet3);
                                    hashSet2.removeAll(hashSet3);
                                } else {
                                    throw null;
                                }
                            } else {
                                hashSet2 = null;
                            }
                            if (string3 != null) {
                                if (this.A0I) {
                                    A0D(null);
                                }
                                A0B(this.A0D);
                                this.A0D = null;
                                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string3);
                                A0A(spannableStringBuilder, hashSet, true);
                                if (hashSet2 != null) {
                                    A0A(spannableStringBuilder, hashSet2, false);
                                }
                                getText().replace(i2, length, spannableStringBuilder);
                                return true;
                            }
                            throw null;
                        }
                        return super.onTextContextMenuItem(i);
                    }
                    return super.onTextContextMenuItem(i);
                }
                throw null;
            }
        } else if (i == 16908320 || i == 16908321) {
            this.A0G.A01(C02M.A02).edit().putString("copied_message_without_mentions", A06(i2, length)).putString("copied_message", getText().subSequence(i2, length).toString()).putString("copied_message_jids", AnonymousClass029.A0v(getMentions())).apply();
        }
        return super.onTextContextMenuItem(i);
    }

    public void setMentionPickerVisibilityChangeListener(C2LT c2lt) {
        this.A0B = c2lt;
    }

    public void setMentionableText(String str, Collection collection) {
        if (collection == null || collection.isEmpty()) {
            setText(str);
            return;
        }
        if (this.A0I) {
            A0D(null);
        }
        A0B(this.A0D);
        this.A0D = null;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        A0A(spannableStringBuilder, collection, true);
        setText(spannableStringBuilder);
    }

    public void setOnCommitContentListener(C31S c31s) {
        this.A0E = c31s;
    }

    public void setText(String str) {
        C68123Id[] c68123IdArr;
        for (C68123Id c68123Id : (C68123Id[]) getText().getSpans(0, getText().length(), C68123Id.class)) {
            A0B(c68123Id.A00);
            A0B(c68123Id);
        }
        A0B(this.A0D);
        this.A0D = null;
        super.setText((CharSequence) str);
    }
}
