package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import org.npci.commonlibrary.widget.FormItemEditText;

/* renamed from: X.4GH */
/* loaded from: classes3.dex */
public class C4GH extends LinearLayout implements C4BK {
    public int A00;
    public int A01;
    public Button A02;
    public ImageView A03;
    public LinearLayout A04;
    public ProgressBar A05;
    public TextView A06;
    public Object A07;
    public String A08;
    public String A09;
    public FormItemEditText A0A;
    public C4BR A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;

    public C4GH(Context context) {
        super(context);
        this.A0C = false;
        this.A09 = "";
        this.A0D = false;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, C61982x8.A18);
        if (obtainStyledAttributes != null) {
            this.A08 = obtainStyledAttributes.getString(2);
            this.A00 = obtainStyledAttributes.getInteger(1, 6);
            this.A0E = obtainStyledAttributes.getBoolean(0, false);
            obtainStyledAttributes.recycle();
        }
        LinearLayout.inflate(context, R.layout.npci_layout_form_item, this);
        this.A04 = (LinearLayout) findViewById(R.id.form_item_action_bar);
        this.A06 = (TextView) findViewById(R.id.form_item_title);
        this.A0A = (FormItemEditText) findViewById(R.id.form_item_input);
        this.A02 = (Button) findViewById(R.id.form_item_button);
        this.A05 = (ProgressBar) findViewById(R.id.form_item_progress);
        this.A03 = (ImageView) findViewById(R.id.form_item_image);
        this.A0A.setInputType(0);
        setTitle(this.A08);
        setInputLength(this.A00);
        this.A0A.addTextChangedListener(new C2JT() { // from class: X.4GG
            {
                C4GH.this = this;
            }

            @Override // X.C2JT, android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                C4GH c4gh = C4GH.this;
                if (c4gh.A0C) {
                    c4gh.A09 = editable.toString();
                } else if (c4gh.A0D) {
                    c4gh.A09 = editable.toString();
                } else if (editable.length() == 0) {
                    c4gh.A09 = "";
                } else if (c4gh.A09.length() > editable.length()) {
                    String str = c4gh.A09;
                    c4gh.A09 = str.substring(0, str.length() - 1);
                } else {
                    char charAt = editable.toString().charAt(editable.length() - 1);
                    if (charAt != 9679) {
                        String str2 = c4gh.A09;
                        StringBuilder sb = new StringBuilder();
                        sb.append("");
                        sb.append(charAt);
                        String concat = str2.concat(sb.toString());
                        c4gh.A09 = concat;
                        c4gh.A0A.setText(concat.replaceAll(".", "●"));
                        return;
                    }
                    c4gh.A0A.setSelection(editable.length());
                }
            }

            @Override // X.C2JT, android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                C4GH c4gh = C4GH.this;
                if (c4gh.A0B == null || c4gh.A0A.getText() == null || c4gh.A0A.getText().length() < c4gh.A00) {
                    return;
                }
                c4gh.A0B.AKc(c4gh.A01, c4gh.A0A.getText().toString());
            }
        });
        this.A0A.setOnTouchListener(new View.OnTouchListener() { // from class: X.3ec
            {
                C4GH.this = this;
            }

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return C4GH.this.A03(view, motionEvent);
            }
        });
        setActionBarPositionTop(this.A0E);
    }

    public final C0TT A00(View view, final boolean z) {
        C0TT A0E = C0AT.A0E(view);
        float f = z ? 1.0f : 0.0f;
        View view2 = (View) A0E.A01.get();
        if (view2 != null) {
            view2.animate().scaleY(f);
        }
        float f2 = z ? 1.0f : 0.0f;
        View view3 = (View) A0E.A01.get();
        if (view3 != null) {
            view3.animate().scaleX(f2);
        }
        AccelerateInterpolator accelerateInterpolator = new AccelerateInterpolator();
        View view4 = (View) A0E.A01.get();
        if (view4 != null) {
            view4.animate().setInterpolator(accelerateInterpolator);
        }
        C06680Un c06680Un = new C06680Un() { // from class: X.4I9
            @Override // X.C0TU
            public void AH8(View view5) {
                view5.setVisibility(z ? 0 : 8);
            }
        };
        View view5 = (View) A0E.A01.get();
        if (view5 != null) {
            A0E.A05(view5, c06680Un);
        }
        A0E.A02(z ? 1.0f : 0.5f);
        return A0E;
    }

    public void A01(String str, boolean z) {
        if (!TextUtils.isEmpty(str)) {
            this.A02.setText(str);
        }
        A00(this.A02, z);
        this.A02.setEnabled(false);
        this.A02.setOnClickListener(null);
    }

    public void A02(boolean z) {
        C0TT A00 = A00(this.A05, z);
        AccelerateDecelerateInterpolator accelerateDecelerateInterpolator = new AccelerateDecelerateInterpolator();
        View view = (View) A00.A01.get();
        if (view != null) {
            view.animate().setInterpolator(accelerateDecelerateInterpolator);
        }
        A00.A01();
    }

    public /* synthetic */ boolean A03(View view, MotionEvent motionEvent) {
        view.performClick();
        if (this.A0B == null || motionEvent.getAction() != 1) {
            return false;
        }
        this.A0B.AKb(this.A01);
        return false;
    }

    @Override // X.C4BK
    public boolean A7v() {
        this.A0A.requestFocus();
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0014, code lost:
        if (r10 != 1) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0019, code lost:
        if (r10 != 2) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x001b, code lost:
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x001d, code lost:
        if (r10 != 3) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x001f, code lost:
        r5.setCompoundDrawablesWithIntrinsicBounds(r3, r2, r1, r8);
        r6.A02.setOnClickListener(r9);
        r6.A02.setEnabled(r12);
        A00(r6.A02, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0031, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0032, code lost:
        r8 = null;
     */
    @Override // X.C4BK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void AVc(java.lang.String r7, android.graphics.drawable.Drawable r8, android.view.View.OnClickListener r9, int r10, boolean r11, boolean r12) {
        /*
            r6 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 != 0) goto Lb
            android.widget.Button r0 = r6.A02
            r0.setText(r7)
        Lb:
            android.widget.Button r5 = r6.A02
            r4 = 0
            r3 = r8
            if (r10 == 0) goto L16
            r3 = r4
            r0 = 1
            r2 = r8
            if (r10 == r0) goto L1b
        L16:
            r2 = r4
            r0 = 2
            r1 = r8
            if (r10 == r0) goto L32
        L1b:
            r1 = r4
            r0 = 3
            if (r10 != r0) goto L32
        L1f:
            r5.setCompoundDrawablesWithIntrinsicBounds(r3, r2, r1, r8)
            android.widget.Button r0 = r6.A02
            r0.setOnClickListener(r9)
            android.widget.Button r0 = r6.A02
            r0.setEnabled(r12)
            android.widget.Button r0 = r6.A02
            r6.A00(r0, r11)
            return
        L32:
            r8 = r4
            goto L1f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4GH.AVc(java.lang.String, android.graphics.drawable.Drawable, android.view.View$OnClickListener, int, boolean, boolean):void");
    }

    @Override // X.C4BK
    public boolean AVd() {
        if (!this.A0D) {
            this.A0D = true;
            setText(this.A09);
        } else {
            this.A0D = false;
            this.A0A.setText(this.A09.replaceAll(".", "●"));
        }
        return this.A0D;
    }

    @Override // X.C4BK
    public Object getFormDataTag() {
        return this.A07;
    }

    public FormItemEditText getFormInputView() {
        return this.A0A;
    }

    public C4BR getFormItemListener() {
        return this.A0B;
    }

    public int getInputLength() {
        return this.A00;
    }

    @Override // X.C4BK
    public String getInputValue() {
        if (!this.A0C && !this.A0D) {
            return this.A09;
        }
        return this.A0A.getText().toString();
    }

    public void setActionBarPositionTop(boolean z) {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.A04.getLayoutParams();
        if (z) {
            layoutParams.addRule(10);
            layoutParams.addRule(8, 0);
        } else {
            layoutParams.addRule(10, 0);
            layoutParams.addRule(8, R.id.form_item_input);
        }
        this.A04.setLayoutParams(layoutParams);
    }

    public void setFormDataTag(Object obj) {
        this.A07 = obj;
    }

    public void setFormItemListener(C4BR c4br) {
        this.A0B = c4br;
    }

    public void setFormItemTag(int i) {
        this.A01 = i;
    }

    public void setInputLength(int i) {
        this.A0A.setMaxLength(i);
        this.A00 = i;
    }

    public void setText(String str) {
        this.A0A.setText(str);
        this.A0A.setSelection(str.length());
    }

    public void setTitle(String str) {
        this.A06.setText(str);
        this.A08 = str;
    }
}
