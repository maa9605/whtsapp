package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextWatcher;
import android.text.style.ClickableSpan;
import android.text.style.ImageSpan;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.rendercore.text.RCTextView;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0AJ */
/* loaded from: classes.dex */
public class C0AJ {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:652:0x0690  */
    /* JADX WARN: Removed duplicated region for block: B:655:0x06e1  */
    /* JADX WARN: Type inference failed for: r5v13, types: [java.lang.CharSequence] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.InterfaceC016607s A00(X.C016107n r31, X.C016807u r32, X.AbstractC016307p r33, int r34, int r35) {
        /*
            Method dump skipped, instructions count: 1771
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0AJ.A00(X.07n, X.07u, X.07p, int, int):X.07s");
    }

    public AbstractC016307p A01(final AnonymousClass087 anonymousClass087, final C016807u c016807u, C20430xW c20430xW) {
        C1F4 c1f4;
        AbstractC28841Ub abstractC28841Ub;
        int A06;
        C25211Em c25211Em;
        boolean z;
        int i = c016807u.A01;
        if (i != 13317) {
            AnonymousClass089 anonymousClass089 = null;
            if (i != 13320) {
                if (i != 13326) {
                    if (i == 13329) {
                        AbstractC016307p abstractC016307p = new AbstractC016307p(((AbstractC016907v) c016807u).A00) { // from class: X.07o
                            public static C08C A01 = new C08C() { // from class: X.1Ys
                                @Override // X.C08C
                                public void A5g(Context context, Object obj, Object obj2, Object obj3) {
                                    RCTextView rCTextView = (RCTextView) obj;
                                    if (obj3 != null) {
                                        C016407q c016407q = (C016407q) obj3;
                                        CharSequence charSequence = c016407q.A03;
                                        Layout layout = c016407q.A01;
                                        float f = c016407q.A00;
                                        C07S c07s = c016407q.A02;
                                        ColorStateList colorStateList = c07s.A0N;
                                        int i2 = c07s.A0K;
                                        int i3 = c07s.A07;
                                        ImageSpan[] imageSpanArr = c016407q.A05;
                                        ClickableSpan[] clickableSpanArr = c016407q.A04;
                                        rCTextView.A09 = charSequence;
                                        rCTextView.A08 = layout;
                                        rCTextView.A00 = f;
                                        rCTextView.A01 = i3;
                                        if (i2 != 0) {
                                            rCTextView.A05 = null;
                                            rCTextView.A02 = i2;
                                        } else {
                                            rCTextView.A05 = colorStateList;
                                            rCTextView.A02 = colorStateList.getDefaultColor();
                                            Layout layout2 = rCTextView.A08;
                                            if (layout2 != null) {
                                                layout2.getPaint().setColor(rCTextView.A05.getColorForState(rCTextView.getDrawableState(), rCTextView.A02));
                                            }
                                        }
                                        rCTextView.A01(0, 0);
                                        if (imageSpanArr != null) {
                                            for (ImageSpan imageSpan : imageSpanArr) {
                                                Drawable drawable = imageSpan.getDrawable();
                                                drawable.setCallback(rCTextView);
                                                drawable.setVisible(true, false);
                                            }
                                        }
                                        rCTextView.A0C = imageSpanArr;
                                        rCTextView.A0B = clickableSpanArr;
                                        rCTextView.invalidate();
                                        return;
                                    }
                                    throw new RuntimeException("Missing text layout context!");
                                }

                                @Override // X.C08C
                                public boolean AUY(Object obj, Object obj2, Object obj3, Object obj4) {
                                    return true;
                                }

                                @Override // X.C08C
                                public void AVh(Context context, Object obj, Object obj2, Object obj3) {
                                    RCTextView rCTextView = (RCTextView) obj;
                                    rCTextView.A09 = null;
                                    rCTextView.A08 = null;
                                    rCTextView.A00 = 0.0f;
                                    rCTextView.A01 = 0;
                                    rCTextView.A05 = null;
                                    rCTextView.A02 = 0;
                                    ImageSpan[] imageSpanArr = rCTextView.A0C;
                                    if (imageSpanArr != null) {
                                        int length = imageSpanArr.length;
                                        for (int i2 = 0; i2 < length; i2++) {
                                            Drawable drawable = rCTextView.A0C[i2].getDrawable();
                                            drawable.setCallback(null);
                                            drawable.setVisible(false, false);
                                        }
                                        rCTextView.A0C = null;
                                    }
                                    if (obj3 != null) {
                                        return;
                                    }
                                    throw new RuntimeException("Missing text layout context!");
                                }
                            };
                            public long A00;

                            {
                                super(EnumC20560xj.VIEW);
                                this.A00 = r3;
                                A06(new C08D(this, A01));
                            }

                            @Override // X.AbstractC016307p
                            public long A04() {
                                return this.A00;
                            }

                            @Override // X.AbstractC016307p
                            public Object A07(Context context) {
                                return new RCTextView(context);
                            }

                            @Override // X.AbstractC016307p, X.C07T
                            public /* bridge */ /* synthetic */ C07T AGA() {
                                return super.AGA();
                            }
                        };
                        C09P AA3 = c016807u.AA3(C25091Ea.A03);
                        if (AA3 != null) {
                            abstractC016307p.A06(new C08D(abstractC016307p, new C33721gM(c016807u, AA3, anonymousClass087)));
                        }
                        return abstractC016307p;
                    } else if (i != 13335) {
                        if (i != 13336) {
                            return null;
                        }
                        return new AbstractC30911bN(c016807u, anonymousClass087) { // from class: X.156
                            @Override // X.AbstractC30911bN, X.AbstractC016307p
                            public Object A07(Context context) {
                                C1E4 c1e4 = new C1E4(context);
                                c1e4.setBackgroundResource(17170445);
                                return c1e4;
                            }

                            @Override // X.AbstractC30911bN
                            public View A08(Context context) {
                                C1E4 c1e4 = new C1E4(context);
                                c1e4.setBackgroundResource(17170445);
                                return c1e4;
                            }

                            @Override // X.AbstractC30911bN
                            public void A0A(View view, final AnonymousClass087 anonymousClass0872, final C016807u c016807u2, Object obj) {
                                C1E4 c1e4 = (C1E4) view;
                                C33711gL c33711gL = (C33711gL) AnonymousClass088.A0o(anonymousClass0872, c016807u2);
                                c33711gL.A0C = c1e4;
                                c33711gL.A00 = c1e4.getTextSize();
                                Parcelable parcelable = c33711gL.A09;
                                if (parcelable != null) {
                                    c1e4.onRestoreInstanceState(parcelable);
                                }
                                ArrayList arrayList = new ArrayList();
                                C1EN.A00(c1e4, c016807u2, c33711gL.A0E);
                                c33711gL.A08.set(c1e4.getPaddingLeft(), c1e4.getPaddingTop(), c1e4.getPaddingRight(), c1e4.getPaddingBottom());
                                c33711gL.A02 = c1e4.getInputType();
                                int i2 = c33711gL.A05;
                                if (i2 == -1) {
                                    if (c1e4.getText() != null) {
                                        c1e4.setSelection(c1e4.getText().length());
                                    }
                                } else {
                                    c1e4.setSelection(i2, c33711gL.A04);
                                }
                                if (c33711gL.A0B == null) {
                                    c33711gL.A0B = new TextWatcher(c016807u2, anonymousClass0872) { // from class: X.1EM
                                        public final AnonymousClass087 A00;
                                        public final C33711gL A01;
                                        public final C016807u A02;

                                        @Override // android.text.TextWatcher
                                        public void afterTextChanged(Editable editable) {
                                        }

                                        @Override // android.text.TextWatcher
                                        public void beforeTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
                                        }

                                        {
                                            this.A02 = c016807u2;
                                            this.A00 = anonymousClass0872;
                                            this.A01 = (C33711gL) AnonymousClass088.A0o(anonymousClass0872, c016807u2);
                                        }

                                        @Override // android.text.TextWatcher
                                        public void onTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
                                            int lineCount;
                                            final String charSequence2 = charSequence.toString();
                                            C33711gL c33711gL2 = this.A01;
                                            c33711gL2.A0E = charSequence2;
                                            C016807u c016807u3 = this.A02;
                                            if (c016807u3.A8Z(C25151Eg.A0B, false) && (lineCount = ((TextView) ((AbstractC016907v) c016807u3).A01.A07).getLineCount()) >= 1 && c33711gL2.A03 != lineCount) {
                                                c33711gL2.A03 = ((TextView) ((AbstractC016907v) c016807u3).A01.A07).getLineCount();
                                                C020209i A0a = AnonymousClass088.A0a(this.A00);
                                                A0a.A03(((AbstractC016907v) c016807u3).A00, new AbstractC25291Eu() { // from class: X.1gK
                                                    @Override // X.AbstractC25291Eu
                                                    public void A00(InterfaceC017107x interfaceC017107x) {
                                                        ((C016807u) interfaceC017107x).A00.A02(C1EN.A00, charSequence2);
                                                    }
                                                });
                                                A0a.A02();
                                            }
                                            C09P AA32 = c016807u3.AA3(C25151Eg.A09);
                                            if (AA32 != null) {
                                                ArrayList arrayList2 = new ArrayList();
                                                InterfaceC020509l A0f = AnonymousClass088.A0f(c016807u3);
                                                if (arrayList2.size() == 0) {
                                                    arrayList2.add(A0f);
                                                    C25031Du.A00(((AbstractC016907v) c016807u3).A00, AA32, new C021109r(arrayList2), this.A00);
                                                    return;
                                                }
                                                throw new IllegalArgumentException("arguments have to be continuous");
                                            }
                                        }
                                    };
                                }
                                C1E3 c1e3 = c33711gL.A0D;
                                if (c1e3 == null) {
                                    c1e3 = new C33691gJ(c016807u2, anonymousClass0872);
                                    c33711gL.A0D = c1e3;
                                }
                                c1e4.A00 = c1e3;
                                c1e4.removeTextChangedListener(c33711gL.A0B);
                                c1e4.addTextChangedListener(c33711gL.A0B);
                                String str = (String) c016807u2.A00.A00(C25151Eg.A05);
                                if (str != null) {
                                    TextWatcher textWatcher = c33711gL.A0A;
                                    if (textWatcher == null) {
                                        textWatcher = new C1EC(str, c1e4);
                                        c33711gL.A0A = textWatcher;
                                    }
                                    c1e4.removeTextChangedListener(textWatcher);
                                    c1e4.addTextChangedListener(c33711gL.A0A);
                                }
                                C09P AA32 = c016807u2.AA3(C25151Eg.A06);
                                C09P AA33 = c016807u2.AA3(C25151Eg.A07);
                                if (AA32 != null || AA33 != null) {
                                    c1e4.setOnFocusChangeListener(new View.OnFocusChangeListener(c016807u2, anonymousClass0872, AA32, AA33) { // from class: X.1EL
                                        public final AnonymousClass087 A00;
                                        public final C016807u A01;
                                        public final C09P A02;
                                        public final C09P A03;

                                        {
                                            this.A01 = c016807u2;
                                            this.A00 = anonymousClass0872;
                                            this.A02 = AA32;
                                            this.A03 = AA33;
                                        }

                                        @Override // android.view.View.OnFocusChangeListener
                                        public void onFocusChange(View view2, boolean z2) {
                                            if (z2) {
                                                C09P c09p = this.A02;
                                                if (c09p != null) {
                                                    ArrayList arrayList2 = new ArrayList();
                                                    C016807u c016807u3 = this.A01;
                                                    InterfaceC020509l A0f = AnonymousClass088.A0f(c016807u3);
                                                    if (arrayList2.size() == 0) {
                                                        arrayList2.add(A0f);
                                                        C25031Du.A00(((AbstractC016907v) c016807u3).A00, c09p, new C021109r(arrayList2), this.A00);
                                                        return;
                                                    }
                                                    throw new IllegalArgumentException("arguments have to be continuous");
                                                }
                                                return;
                                            }
                                            C09P c09p2 = this.A03;
                                            if (c09p2 == null) {
                                                return;
                                            }
                                            ArrayList arrayList3 = new ArrayList();
                                            C016807u c016807u4 = this.A01;
                                            InterfaceC020509l A0f2 = AnonymousClass088.A0f(c016807u4);
                                            if (arrayList3.size() == 0) {
                                                arrayList3.add(A0f2);
                                                C25031Du.A00(((AbstractC016907v) c016807u4).A00, c09p2, new C021109r(arrayList3), this.A00);
                                                return;
                                            }
                                            throw new IllegalArgumentException("arguments have to be continuous");
                                        }
                                    });
                                }
                                AnonymousClass081 anonymousClass081 = (AnonymousClass081) c016807u2.A00.A00(C25151Eg.A0J);
                                c33711gL.A07 = c1e4.getTextColors();
                                if (anonymousClass081 != null) {
                                    c1e4.setTextColor(AnonymousClass088.A06(anonymousClass081, anonymousClass0872));
                                } else {
                                    String str2 = (String) c016807u2.A00.A00(C25151Eg.A0G);
                                    if (str2 != null) {
                                        try {
                                            c1e4.setTextColor(C08i.A04(str2));
                                        } catch (C018208m e) {
                                            AnonymousClass088.A1j("TextInputBinderUtils", "Error parsing text color for Text input", e);
                                        }
                                    }
                                }
                                c33711gL.A06 = c1e4.getHintTextColors();
                                AnonymousClass081 anonymousClass0812 = (AnonymousClass081) c016807u2.A00.A00(C25151Eg.A03);
                                if (anonymousClass0812 != null) {
                                    c1e4.setHintTextColor(AnonymousClass088.A06(anonymousClass0812, anonymousClass0872));
                                }
                                int A04 = c016807u2.A04(C25151Eg.A04, -1);
                                if (A04 > -1) {
                                    arrayList.add(new InputFilter.LengthFilter(A04));
                                }
                                final C09P AA34 = c016807u2.AA3(C25151Eg.A00);
                                if (AA34 != null) {
                                    arrayList.add(new InputFilter() { // from class: X.1EJ
                                        @Override // android.text.InputFilter
                                        public CharSequence filter(CharSequence charSequence, int i3, int i4, Spanned spanned, int i5, int i6) {
                                            String obj2 = spanned.toString();
                                            StringBuffer stringBuffer = new StringBuffer(obj2);
                                            stringBuffer.replace(i5, i6, charSequence.toString());
                                            ArrayList arrayList2 = new ArrayList();
                                            InterfaceC020509l A0f = AnonymousClass088.A0f(obj2);
                                            if (arrayList2.size() == 0) {
                                                arrayList2.add(A0f);
                                                InterfaceC020509l A0f2 = AnonymousClass088.A0f(stringBuffer.toString());
                                                if (arrayList2.size() == 1) {
                                                    arrayList2.add(A0f2);
                                                    if (AnonymousClass088.A27((Number) C25031Du.A00(((AbstractC016907v) c016807u2).A00, AA34, new C021109r(arrayList2), anonymousClass0872))) {
                                                        return null;
                                                    }
                                                    return "";
                                                }
                                                throw new IllegalArgumentException("arguments have to be continuous");
                                            }
                                            throw new IllegalArgumentException("arguments have to be continuous");
                                        }
                                    });
                                }
                                c1e4.setFilters((InputFilter[]) arrayList.toArray(new InputFilter[arrayList.size()]));
                                c33711gL.A01 = c1e4.getImeOptions();
                                String str3 = (String) c016807u2.A00.A00(C25151Eg.A0C);
                                if (str3 != null) {
                                    int hashCode = str3.hashCode();
                                    if (hashCode != 3089282) {
                                        if (hashCode == 3377907 && str3.equals("next")) {
                                            c1e4.setImeOptions(5);
                                        }
                                    } else if (str3.equals("done")) {
                                        c1e4.setImeOptions(6);
                                    }
                                }
                                final C09P AA35 = c016807u2.AA3(C25151Eg.A08);
                                if (AA35 != null) {
                                    c1e4.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: X.1EK
                                        @Override // android.widget.TextView.OnEditorActionListener
                                        public boolean onEditorAction(TextView textView, int i3, KeyEvent keyEvent) {
                                            ArrayList arrayList2 = new ArrayList();
                                            C016807u c016807u3 = c016807u2;
                                            InterfaceC020509l A0f = AnonymousClass088.A0f(c016807u3);
                                            if (arrayList2.size() == 0) {
                                                arrayList2.add(A0f);
                                                C25031Du.A00(((AbstractC016907v) c016807u3).A00, AA35, new C021109r(arrayList2), anonymousClass0872);
                                                return true;
                                            }
                                            throw new IllegalArgumentException("arguments have to be continuous");
                                        }
                                    });
                                }
                            }

                            @Override // X.AbstractC30911bN
                            public void A0B(View view, AnonymousClass087 anonymousClass0872, C016807u c016807u2, Object obj) {
                                C1E4 c1e4 = (C1E4) view;
                                C33711gL c33711gL = (C33711gL) AnonymousClass088.A0o(anonymousClass0872, c016807u2);
                                c33711gL.A0E = c1e4.getText().toString();
                                c33711gL.A09 = c1e4.onSaveInstanceState();
                                c1e4.removeTextChangedListener(c33711gL.A0B);
                                TextWatcher textWatcher = c33711gL.A0A;
                                if (textWatcher != null) {
                                    c1e4.removeTextChangedListener(textWatcher);
                                }
                                c1e4.A00 = null;
                                c1e4.setFilters(C1EN.A01);
                                c1e4.setOnFocusChangeListener(null);
                                c1e4.setOnEditorActionListener(null);
                                c1e4.setText("");
                                c1e4.setGravity(8388659);
                                c1e4.setTypeface(Typeface.DEFAULT);
                                c1e4.setHint("");
                                c1e4.setMaxLines(Integer.MAX_VALUE);
                                c1e4.setImeOptions(c33711gL.A01);
                                c1e4.setTextColor(c33711gL.A07);
                                c1e4.setHintTextColor(c33711gL.A06);
                                c1e4.setInputType(c33711gL.A02);
                                c1e4.setTextSize(0, c33711gL.A00);
                                Rect rect = c33711gL.A08;
                                c1e4.setPadding(rect.left, rect.top, rect.right, rect.bottom);
                                c33711gL.A0C = null;
                            }
                        };
                    } else {
                        AbstractC016307p abstractC016307p2 = new AbstractC016307p(((AbstractC016907v) c016807u).A00) { // from class: X.07o
                            public static C08C A01 = new C08C() { // from class: X.1Ys
                                @Override // X.C08C
                                public void A5g(Context context, Object obj, Object obj2, Object obj3) {
                                    RCTextView rCTextView = (RCTextView) obj;
                                    if (obj3 != null) {
                                        C016407q c016407q = (C016407q) obj3;
                                        CharSequence charSequence = c016407q.A03;
                                        Layout layout = c016407q.A01;
                                        float f = c016407q.A00;
                                        C07S c07s = c016407q.A02;
                                        ColorStateList colorStateList = c07s.A0N;
                                        int i2 = c07s.A0K;
                                        int i3 = c07s.A07;
                                        ImageSpan[] imageSpanArr = c016407q.A05;
                                        ClickableSpan[] clickableSpanArr = c016407q.A04;
                                        rCTextView.A09 = charSequence;
                                        rCTextView.A08 = layout;
                                        rCTextView.A00 = f;
                                        rCTextView.A01 = i3;
                                        if (i2 != 0) {
                                            rCTextView.A05 = null;
                                            rCTextView.A02 = i2;
                                        } else {
                                            rCTextView.A05 = colorStateList;
                                            rCTextView.A02 = colorStateList.getDefaultColor();
                                            Layout layout2 = rCTextView.A08;
                                            if (layout2 != null) {
                                                layout2.getPaint().setColor(rCTextView.A05.getColorForState(rCTextView.getDrawableState(), rCTextView.A02));
                                            }
                                        }
                                        rCTextView.A01(0, 0);
                                        if (imageSpanArr != null) {
                                            for (ImageSpan imageSpan : imageSpanArr) {
                                                Drawable drawable = imageSpan.getDrawable();
                                                drawable.setCallback(rCTextView);
                                                drawable.setVisible(true, false);
                                            }
                                        }
                                        rCTextView.A0C = imageSpanArr;
                                        rCTextView.A0B = clickableSpanArr;
                                        rCTextView.invalidate();
                                        return;
                                    }
                                    throw new RuntimeException("Missing text layout context!");
                                }

                                @Override // X.C08C
                                public boolean AUY(Object obj, Object obj2, Object obj3, Object obj4) {
                                    return true;
                                }

                                @Override // X.C08C
                                public void AVh(Context context, Object obj, Object obj2, Object obj3) {
                                    RCTextView rCTextView = (RCTextView) obj;
                                    rCTextView.A09 = null;
                                    rCTextView.A08 = null;
                                    rCTextView.A00 = 0.0f;
                                    rCTextView.A01 = 0;
                                    rCTextView.A05 = null;
                                    rCTextView.A02 = 0;
                                    ImageSpan[] imageSpanArr = rCTextView.A0C;
                                    if (imageSpanArr != null) {
                                        int length = imageSpanArr.length;
                                        for (int i2 = 0; i2 < length; i2++) {
                                            Drawable drawable = rCTextView.A0C[i2].getDrawable();
                                            drawable.setCallback(null);
                                            drawable.setVisible(false, false);
                                        }
                                        rCTextView.A0C = null;
                                    }
                                    if (obj3 != null) {
                                        return;
                                    }
                                    throw new RuntimeException("Missing text layout context!");
                                }
                            };
                            public long A00;

                            {
                                super(EnumC20560xj.VIEW);
                                this.A00 = r3;
                                A06(new C08D(this, A01));
                            }

                            @Override // X.AbstractC016307p
                            public long A04() {
                                return this.A00;
                            }

                            @Override // X.AbstractC016307p
                            public Object A07(Context context) {
                                return new RCTextView(context);
                            }

                            @Override // X.AbstractC016307p, X.C07T
                            public /* bridge */ /* synthetic */ C07T AGA() {
                                return super.AGA();
                            }
                        };
                        C09P AA32 = c016807u.AA3(C25141Ef.A03);
                        if (AA32 != null) {
                            abstractC016307p2.A06(new C08D(abstractC016307p2, new C33721gM(c016807u, AA32, anonymousClass087)));
                        }
                        return abstractC016307p2;
                    }
                }
                return new AbstractC30911bN(c016807u, anonymousClass087) { // from class: X.15Z
                    @Override // X.AbstractC30911bN
                    public void A0A(View view, AnonymousClass087 anonymousClass0872, C016807u c016807u2, Object obj) {
                    }

                    @Override // X.AbstractC30911bN
                    public void A0B(View view, AnonymousClass087 anonymousClass0872, C016807u c016807u2, Object obj) {
                    }

                    @Override // X.AbstractC30911bN, X.AbstractC016307p
                    public Object A07(Context context) {
                        return new ProgressBar(context);
                    }

                    @Override // X.AbstractC30911bN
                    public View A08(Context context) {
                        return new ProgressBar(context);
                    }
                };
            }
            try {
                String str = (String) c016807u.A00.A00(C1EW.A04);
                if (str != null && AnonymousClass088.A0l(str).intValue() == 4) {
                    anonymousClass089 = new AnonymousClass089(((AbstractC016907v) c016807u).A00);
                    anonymousClass089.A00 = 4;
                }
                boolean A8Z = c016807u.A8Z(C1EW.A02, true);
                if (!A8Z) {
                    if (anonymousClass089 == null) {
                        anonymousClass089 = new AnonymousClass089(((AbstractC016907v) c016807u).A00);
                    }
                    anonymousClass089.A06 = A8Z;
                }
                final C09P AA33 = c016807u.AA3(C1EW.A03);
                if (AA33 != null) {
                    if (anonymousClass089 == null) {
                        anonymousClass089 = new AnonymousClass089(((AbstractC016907v) c016807u).A00);
                    }
                    anonymousClass089.A05 = new View.OnClickListener() { // from class: X.1E9
                        @Override // android.view.View.OnClickListener
                        public void onClick(View view) {
                            C016807u c016807u2 = c016807u;
                            int i2 = ((AbstractC016907v) c016807u2).A00;
                            C09P c09p = AA33;
                            ArrayList arrayList = new ArrayList();
                            InterfaceC020509l A0f = AnonymousClass088.A0f(c016807u2);
                            if (arrayList.size() == 0) {
                                arrayList.add(A0f);
                                C25031Du.A00(i2, c09p, new C021109r(arrayList), anonymousClass087);
                                return;
                            }
                            throw new IllegalArgumentException("arguments have to be continuous");
                        }
                    };
                }
                AnonymousClass081 anonymousClass081 = (AnonymousClass081) c016807u.A00.A00(C1EW.A01);
                if (anonymousClass081 != null) {
                    if (anonymousClass089 == null) {
                        anonymousClass089 = new AnonymousClass089(((AbstractC016907v) c016807u).A00);
                    }
                    anonymousClass089.A01 = anonymousClass087;
                    anonymousClass089.A02 = anonymousClass081;
                    AnonymousClass080 anonymousClass080 = (AnonymousClass080) anonymousClass081.ABT(C017808h.A00);
                    Drawable drawable = null;
                    if (anonymousClass080 != null) {
                        c25211Em = C09M.A00().A05.A00(anonymousClass089.A01, anonymousClass080, anonymousClass089.A02);
                        z = C09M.A00().A05.A01(anonymousClass080);
                    } else {
                        c25211Em = null;
                        z = false;
                    }
                    AnonymousClass080 anonymousClass0802 = (AnonymousClass080) anonymousClass089.A02.ABT(C017808h.A09);
                    if (anonymousClass0802 != null) {
                        drawable = C09M.A00().A05.A00(anonymousClass089.A01, anonymousClass0802, anonymousClass089.A02);
                        z |= C09M.A00().A05.A01(anonymousClass0802);
                    }
                    if (!anonymousClass089.A02.A8Z(C017808h.A04, false)) {
                        try {
                            AnonymousClass081 anonymousClass0812 = anonymousClass089.A02;
                            AnonymousClass084 anonymousClass084 = C017808h.A03;
                            int A03 = (int) C08i.A03(anonymousClass0812.ADJ(anonymousClass084), 0.0f);
                            if (c25211Em == null && A03 != 0) {
                                int argb = Color.argb(0, 0, 0, 0);
                                AnonymousClass081 anonymousClass0813 = anonymousClass089.A02;
                                C25211Em c25211Em2 = new C25211Em();
                                c25211Em2.A00(argb, C08i.A03(anonymousClass0813.ADJ(C017808h.A07), 0.0f), AnonymousClass088.A05(anonymousClass0813, anonymousClass087), C08i.A03(anonymousClass0813.ADJ(anonymousClass084), 0.0f));
                                c25211Em = c25211Em2;
                            }
                        } catch (C018208m e) {
                            e.printStackTrace();
                        }
                    }
                    ((C08A) anonymousClass089).A03 = c25211Em;
                    ((C08A) anonymousClass089).A04 = drawable;
                    if (z) {
                        ((C08A) anonymousClass089).A01 = 2;
                    }
                }
                return anonymousClass089;
            } catch (IOException e2) {
                throw new IllegalArgumentException(e2);
            }
        }
        C1F4 c1f42 = C1F4.NONE;
        int A08 = AnonymousClass088.A08(c016807u);
        C39141pe c39141pe = new C39141pe(((AbstractC016907v) c016807u).A00);
        C1E7 c1e7 = (C1E7) AnonymousClass088.A0o(anonymousClass087, c016807u);
        c39141pe.A07 = c1e7.A02;
        c39141pe.A06 = c1e7.A01;
        c016807u.A05();
        c39141pe.A01 = A08;
        if (c016807u.A8Z(C018008k.A0G, false)) {
            try {
                int A032 = (int) C08i.A03((String) c016807u.A00.A00(C018008k.A0F), anonymousClass087.A00.getResources().getDisplayMetrics().density * 4.0f);
                AnonymousClass081 anonymousClass0814 = (AnonymousClass081) c016807u.A00.A00(C018008k.A0D);
                if (anonymousClass0814 == null) {
                    A06 = -7829368;
                } else {
                    A06 = AnonymousClass088.A06(anonymousClass0814, anonymousClass087);
                }
                try {
                    C29831Yp c29831Yp = new C29831Yp(A06, A032, (int) C08i.A03((String) c016807u.A00.A00(C018008k.A0E), 0.0f), c016807u.A8Z(C018008k.A05, false));
                    c39141pe.A08(new C33681gI(c29831Yp));
                    List list = c39141pe.A08;
                    if (list == null) {
                        list = new ArrayList();
                        c39141pe.A08 = list;
                    }
                    list.add(c29831Yp);
                } catch (C018208m unused) {
                    throw new RuntimeException("Invalid pixel format for scroll indicator corner radius");
                }
            } catch (C018208m unused2) {
                throw new RuntimeException("Invalid pixel format for scroll indicator size");
            }
        }
        C09P AA34 = c016807u.AA3(C018008k.A09);
        if (AA34 != null) {
            c39141pe.A08(new AbstractC15200oF(c016807u, anonymousClass087, AA34) { // from class: X.1gD
                public final AnonymousClass087 A00;
                public final C016807u A01;
                public final C09P A02;

                {
                    this.A01 = c016807u;
                    this.A02 = AA34;
                    this.A00 = anonymousClass087;
                }

                @Override // X.AbstractC15200oF
                public void A01(RecyclerView recyclerView, int i2, int i3) {
                    C016807u c016807u2 = this.A01;
                    int A04 = c016807u2.A04(C018008k.A0C, 0);
                    if (A04 == 0) {
                        return;
                    }
                    String str2 = recyclerView.canScrollVertically(A04) ? "can_scroll" : "cannot_scroll";
                    ArrayList arrayList = new ArrayList();
                    InterfaceC020509l A0f = AnonymousClass088.A0f(str2);
                    if (arrayList.size() == 0) {
                        arrayList.add(A0f);
                        C25031Du.A00(((AbstractC016907v) c016807u2).A00, this.A02, new C021109r(arrayList), this.A00);
                        return;
                    }
                    throw new IllegalArgumentException("arguments have to be continuous");
                }

                public boolean equals(Object obj) {
                    if (obj == this) {
                        return true;
                    }
                    if (obj == null || !(obj instanceof C33631gD)) {
                        return false;
                    }
                    C33631gD c33631gD = (C33631gD) obj;
                    if (c33631gD.A02 == this.A02) {
                        C016807u c016807u2 = c33631gD.A01;
                        AnonymousClass084 anonymousClass0842 = C018008k.A0C;
                        return c016807u2.A04(anonymousClass0842, 0) == this.A01.A04(anonymousClass0842, 0);
                    }
                    return false;
                }
            });
        }
        C09P AA35 = c016807u.AA3(C018008k.A0A);
        if (AA35 != null) {
            c39141pe.A08(new AbstractC15200oF(c016807u, anonymousClass087, AA35) { // from class: X.1gC
                public final AnonymousClass087 A00;
                public final C016807u A01;
                public final C09P A02;

                {
                    this.A01 = c016807u;
                    this.A00 = anonymousClass087;
                    this.A02 = AA35;
                }

                @Override // X.AbstractC15200oF
                public void A01(RecyclerView recyclerView, int i2, int i3) {
                    C016807u c016807u2 = this.A01;
                    int i4 = ((AbstractC016907v) c016807u2).A00;
                    C09P c09p = this.A02;
                    ArrayList arrayList = new ArrayList();
                    InterfaceC020509l A0f = AnonymousClass088.A0f(c016807u2);
                    if (arrayList.size() == 0) {
                        arrayList.add(A0f);
                        C25031Du.A00(i4, c09p, new C021109r(arrayList), this.A00);
                        return;
                    }
                    throw new IllegalArgumentException("arguments have to be continuous");
                }

                public boolean equals(Object obj) {
                    if (obj == this) {
                        return true;
                    }
                    return obj != null && (obj instanceof C33621gC) && ((C33621gC) obj).A02 == this.A02;
                }
            });
        }
        C09P AA36 = c016807u.AA3(C018008k.A08);
        if (AA36 != null) {
            c39141pe.A08(new AbstractC15200oF(new C33611gB(c016807u, anonymousClass087, AA36)) { // from class: X.1gj
                public static final ViewGroup.MarginLayoutParams A01;
                public C33611gB A00;

                static {
                    ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -1);
                    marginLayoutParams.setMargins(0, 0, 0, 0);
                    A01 = marginLayoutParams;
                }

                {
                    this.A00 = r1;
                }

                @Override // X.AbstractC15200oF
                public void A01(RecyclerView recyclerView, int i2, int i3) {
                    View A0G;
                    ViewGroup.MarginLayoutParams marginLayoutParams;
                    int height;
                    int top;
                    int i4;
                    LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.A0S;
                    int A1G = linearLayoutManager.A1G();
                    if (A1G != -1 && (A0G = linearLayoutManager.A0G(A1G)) != null) {
                        if (A0G.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                            marginLayoutParams = (ViewGroup.MarginLayoutParams) A0G.getLayoutParams();
                        } else {
                            marginLayoutParams = A01;
                        }
                        if (linearLayoutManager.A01 == 0) {
                            height = A0G.getWidth() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
                            if (C0AT.A05(((C0SV) linearLayoutManager).A07) == 0) {
                                top = A0G.getLeft();
                                i4 = marginLayoutParams.leftMargin;
                            } else {
                                top = height - A0G.getRight();
                                i4 = marginLayoutParams.rightMargin;
                            }
                        } else {
                            height = marginLayoutParams.bottomMargin + A0G.getHeight() + marginLayoutParams.topMargin;
                            top = A0G.getTop();
                            i4 = marginLayoutParams.topMargin;
                        }
                        int i5 = -(top - i4);
                        float f = height != 0 ? i5 / height : 0.0f;
                        C33611gB c33611gB = this.A00;
                        if (c33611gB != null) {
                            ArrayList arrayList = new ArrayList();
                            InterfaceC020509l A0f = AnonymousClass088.A0f(c33611gB.A01);
                            if (arrayList.size() == 0) {
                                arrayList.add(A0f);
                                AbstractC021009q A0c = AnonymousClass088.A0c(A1G);
                                if (arrayList.size() == 1) {
                                    arrayList.add(A0c);
                                    C020909p c020909p = new C020909p(f);
                                    if (arrayList.size() == 2) {
                                        arrayList.add(c020909p);
                                        AbstractC021009q A0c2 = AnonymousClass088.A0c(i5);
                                        if (arrayList.size() == 3) {
                                            arrayList.add(A0c2);
                                            C25031Du.A00(((AbstractC016907v) c33611gB.A01).A00, c33611gB.A02, new C021109r(arrayList), c33611gB.A00);
                                            return;
                                        }
                                        throw new IllegalArgumentException("arguments have to be continuous");
                                    }
                                    throw new IllegalArgumentException("arguments have to be continuous");
                                }
                                throw new IllegalArgumentException("arguments have to be continuous");
                            }
                            throw new IllegalArgumentException("arguments have to be continuous");
                        }
                        throw null;
                    }
                }
            });
        }
        String str2 = (String) c016807u.A00.A00(C018008k.A0H);
        if (str2 != null) {
            try {
                switch (str2.hashCode()) {
                    case -1364013995:
                        if (str2.equals("center")) {
                            c1f4 = C1F4.CENTER;
                            break;
                        }
                        throw new C018208m(C000200d.A0H("can't parse unknown snap gravity: ", str2));
                    case 100571:
                        if (str2.equals("end")) {
                            c1f4 = C1F4.END;
                            break;
                        }
                        throw new C018208m(C000200d.A0H("can't parse unknown snap gravity: ", str2));
                    case 3387192:
                        if (str2.equals("none")) {
                            c1f4 = c1f42;
                            break;
                        }
                        throw new C018208m(C000200d.A0H("can't parse unknown snap gravity: ", str2));
                    case 109757538:
                        if (str2.equals("start")) {
                            c1f4 = C1F4.START;
                            break;
                        }
                        throw new C018208m(C000200d.A0H("can't parse unknown snap gravity: ", str2));
                    default:
                        throw new C018208m(C000200d.A0H("can't parse unknown snap gravity: ", str2));
                }
            } catch (C018208m unused3) {
                throw new RuntimeException("Invalid snap gravity value");
            }
        }
        c1f4 = c1f42;
        if (c1f4 != c1f42) {
            C1F5 c1f5 = C1F5.PAGER;
            String str3 = (String) c016807u.A00.A00(C018008k.A0I);
            if (str3 != null) {
                try {
                    int hashCode = str3.hashCode();
                    if (hashCode != -1102672091) {
                        if (hashCode == 106426307 && str3.equals("pager")) {
                        }
                        throw new C018208m(C000200d.A0H("can't parse unknown snap style: ", str3));
                    }
                    if (str3.equals("linear")) {
                        c1f5 = C1F5.LINEAR;
                    }
                    throw new C018208m(C000200d.A0H("can't parse unknown snap style: ", str3));
                } catch (C018208m unused4) {
                    throw new RuntimeException("Invalid snap style value");
                }
            }
            try {
                Float valueOf = Float.valueOf(C08i.A03((String) c016807u.A00.A00(C018008k.A07), 0.0f));
                int ordinal = c1f5.ordinal();
                if (ordinal == 0) {
                    int ordinal2 = c1f4.ordinal();
                    if (ordinal2 != 0) {
                        if (ordinal2 != 1) {
                            if (ordinal2 != 2) {
                                StringBuilder sb = new StringBuilder();
                                sb.append("Invalid gravity type :");
                                sb.append(c1f4);
                                throw new IllegalArgumentException(sb.toString());
                            }
                        } else {
                            abstractC28841Ub = new C38561oc();
                        }
                    }
                    abstractC28841Ub = new C38561oc(c1f4, valueOf) { // from class: X.13o
                        public C1F3 A00;

                        {
                            this.A00 = new C1F3(c1f4, valueOf);
                        }

                        @Override // X.C38561oc, X.AbstractC28841Ub
                        public View A03(C0SV c0sv) {
                            return this.A00.A02(c0sv);
                        }

                        @Override // X.C38561oc, X.AbstractC28841Ub
                        public int[] A05(C0SV c0sv, View view) {
                            return this.A00.A03(c0sv, view);
                        }
                    };
                } else if (ordinal == 1) {
                    int ordinal3 = c1f4.ordinal();
                    if (ordinal3 != 0) {
                        if (ordinal3 != 1) {
                            if (ordinal3 != 2) {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("Invalid gravity type :");
                                sb2.append(c1f4);
                                throw new IllegalArgumentException(sb2.toString());
                            }
                        } else {
                            abstractC28841Ub = new C38581oe();
                        }
                    }
                    abstractC28841Ub = new C38581oe(c1f4, valueOf) { // from class: X.13k
                        public C1F3 A00;

                        {
                            this.A00 = new C1F3(c1f4, valueOf);
                        }

                        @Override // X.C38581oe, X.AbstractC28841Ub
                        public View A03(C0SV c0sv) {
                            return this.A00.A02(c0sv);
                        }

                        @Override // X.C38581oe, X.AbstractC28841Ub
                        public int[] A05(C0SV c0sv, View view) {
                            return this.A00.A03(c0sv, view);
                        }
                    };
                } else {
                    StringBuilder sb3 = new StringBuilder("Invalid snap style type :");
                    sb3.append(c1f5);
                    throw new IllegalArgumentException(sb3.toString());
                }
                c39141pe.A05 = abstractC28841Ub;
                C09P AA37 = c016807u.AA3(C018008k.A0B);
                if (AA37 != null) {
                    c39141pe.A08(new AbstractC15200oF(abstractC28841Ub, new C33651gF(((AbstractC016907v) c016807u).A00, AA37, anonymousClass087)) { // from class: X.1gG
                        public int A00 = -1;
                        public boolean A01;
                        public final AbstractC28841Ub A02;
                        public final C33651gF A03;

                        {
                            this.A02 = abstractC28841Ub;
                            this.A03 = r3;
                        }

                        @Override // X.AbstractC15200oF
                        public void A00(RecyclerView recyclerView, int i2) {
                            C0SV c0sv;
                            View A033;
                            if (i2 == 1) {
                                this.A01 = true;
                            } else if (i2 != 0 || (c0sv = recyclerView.A0S) == null || (A033 = this.A02.A03(c0sv)) == null) {
                            } else {
                                int A00 = RecyclerView.A00(A033);
                                if (A00 == this.A00 && !this.A01) {
                                    return;
                                }
                                C33651gF c33651gF = this.A03;
                                if (c33651gF != null) {
                                    ArrayList arrayList = new ArrayList();
                                    AbstractC021009q A0c = AnonymousClass088.A0c(A00);
                                    if (arrayList.size() == 0) {
                                        arrayList.add(A0c);
                                        C25031Du.A00(c33651gF.A00, c33651gF.A02, new C021109r(arrayList), c33651gF.A01);
                                        this.A00 = A00;
                                        this.A01 = false;
                                        return;
                                    }
                                    throw new IllegalArgumentException("arguments have to be continuous");
                                }
                                throw null;
                            }
                        }

                        public boolean equals(Object obj) {
                            if (obj == this) {
                                return true;
                            }
                            if (obj == null || !(obj instanceof C33661gG)) {
                                return false;
                            }
                            C33661gG c33661gG = (C33661gG) obj;
                            return c33661gG.A02.equals(this.A02) && c33661gG.A03.equals(this.A03);
                        }
                    });
                }
            } catch (C018208m unused5) {
                throw new RuntimeException("Invalid pixel format for left offset on snap");
            }
        }
        try {
            AnonymousClass084 anonymousClass0842 = C018008k.A0J;
            AnonymousClass084 anonymousClass0843 = C018008k.A0K;
            AnonymousClass084 anonymousClass0844 = C018008k.A06;
            float A033 = C08i.A03((String) c016807u.A00.A00(anonymousClass0842), 0.0f);
            float A034 = C08i.A03((String) c016807u.A00.A00(anonymousClass0843), 0.0f);
            float A035 = C08i.A03((String) c016807u.A00.A00(anonymousClass0844), 0.0f);
            if (A033 != 0.0f || A034 != 0.0f || A035 != 0.0f) {
                AbstractC08920cK abstractC08920cK = new AbstractC08920cK(A034, A035, A033, A08) { // from class: X.1g9
                    public final float A00;
                    public final float A01;
                    public final float A02;
                    public final int A03;

                    {
                        this.A01 = A034;
                        this.A02 = A035;
                        this.A00 = A033;
                        this.A03 = A08;
                    }

                    @Override // X.AbstractC08920cK
                    public void A01(Rect rect, View view, RecyclerView recyclerView, C0Y0 c0y0) {
                        int A00 = RecyclerView.A00(view);
                        if (A00 == 0) {
                            if (this.A03 == 1) {
                                rect.top = (int) this.A01;
                            } else {
                                rect.left = (int) this.A01;
                            }
                        }
                        if (A00 < recyclerView.A0N.A0C() - 1) {
                            if (this.A03 == 1) {
                                rect.bottom = (int) this.A02;
                            } else {
                                rect.right = (int) this.A02;
                            }
                        }
                        if (A00 == recyclerView.A0N.A0C() - 1) {
                            if (this.A03 == 1) {
                                rect.bottom = (int) this.A00;
                            } else {
                                rect.right = (int) this.A00;
                            }
                        }
                    }

                    public boolean equals(Object obj) {
                        if (obj == this) {
                            return true;
                        }
                        if (obj == null || !(obj instanceof C33591g9)) {
                            return false;
                        }
                        C33591g9 c33591g9 = (C33591g9) obj;
                        return c33591g9.A03 == this.A03 && c33591g9.A00 == this.A00 && c33591g9.A01 == this.A01 && c33591g9.A02 == this.A02;
                    }
                };
                List list2 = c39141pe.A08;
                if (list2 == null) {
                    list2 = new ArrayList();
                    c39141pe.A08 = list2;
                }
                list2.add(abstractC08920cK);
            }
            if (c016807u.A8Z(C018008k.A04, false)) {
                C38551oa c38551oa = new C38551oa();
                ((C0TQ) c38551oa).A00 = false;
                c39141pe.A04 = c38551oa;
            }
            c39141pe.A02 = c016807u.A8Z(C018008k.A00, false) ? 0 : 2;
            AnonymousClass081 anonymousClass0815 = (AnonymousClass081) c016807u.A00.A00(C018008k.A01);
            if (anonymousClass0815 != null) {
                c39141pe.A00 = AnonymousClass088.A06(anonymousClass0815, anonymousClass087);
            }
            c39141pe.A03 = c016807u.A04(C018008k.A0L, -1);
            c39141pe.A06(new C08D(c39141pe, new C08C(c1e7.A03, new C33581g8(A08, anonymousClass087)) { // from class: X.1gH
                public final C33581g8 A00;
                public final C1E8 A01;

                {
                    this.A01 = r1;
                    this.A00 = r2;
                }

                @Override // X.C08C
                public void A5g(Context context, Object obj, Object obj2, Object obj3) {
                    RecyclerView recyclerView = (RecyclerView) obj;
                    C1E8 c1e8 = this.A01;
                    C33581g8 c33581g8 = this.A00;
                    if (c33581g8.A00 == 1 && ((C892046c) c33581g8.A01.A02).A02 == null) {
                        throw null;
                    }
                    c1e8.A06 = recyclerView;
                    c1e8.A03 = recyclerView.getScrollX();
                    recyclerView.A0m(c1e8.A05);
                    int i2 = c1e8.A00;
                    if (i2 != -1) {
                        if (c1e8.A08) {
                            if (!c1e8.A07.equals("")) {
                                C30891bL c30891bL = new C30891bL(context);
                                c30891bL.A09(c1e8.A07);
                                ((AbstractC15270oM) c30891bL).A00 = c1e8.A00;
                                C0SV c0sv = recyclerView.A0S;
                                if (c0sv != null) {
                                    c0sv.A0W(c30891bL);
                                }
                            } else {
                                recyclerView.A0Z(i2);
                            }
                        } else {
                            recyclerView.A0Y(i2);
                        }
                        c1e8.A00 = -1;
                        c1e8.A08 = false;
                        c1e8.A07 = "";
                    }
                    int i3 = c1e8.A01;
                    if (i3 != -1 || c1e8.A02 != -1) {
                        recyclerView.scrollBy(i3, c1e8.A02);
                        c1e8.A01 = -1;
                        c1e8.A02 = -1;
                    }
                }

                @Override // X.C08C
                public boolean AUY(Object obj, Object obj2, Object obj3, Object obj4) {
                    return true;
                }

                @Override // X.C08C
                public void AVh(Context context, Object obj, Object obj2, Object obj3) {
                    C1E8 c1e8 = this.A01;
                    c1e8.A06 = null;
                    ((RecyclerView) obj).A0n(c1e8.A05);
                }
            }));
            return c39141pe;
        } catch (C018208m unused6) {
            throw new RuntimeException("Invalid pixel format for Collection spacing");
        }
    }

    public AnonymousClass084 A02(C016807u c016807u) {
        int i = c016807u.A01;
        if (i != 13317) {
            if (i != 13320) {
                return null;
            }
            return C1EW.A00;
        }
        return C018008k.A02;
    }

    public Object A03(AnonymousClass087 anonymousClass087, C016807u c016807u) {
        int i = c016807u.A01;
        if (i != 13317) {
            if (i != 13336) {
                return null;
            }
            String str = (String) c016807u.A00.A00(C25151Eg.A0F);
            if (str == null) {
                str = "";
            }
            return new C33711gL(str);
        }
        return new C1E7(new C1E8(), new C20620xp(), new C30901bM(anonymousClass087, c016807u, AnonymousClass088.A08(c016807u)));
    }
}
