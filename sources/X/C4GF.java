package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.search.verification.client.R;
import java.util.ArrayList;

/* renamed from: X.4GF  reason: invalid class name */
/* loaded from: classes3.dex */
public class C4GF extends FrameLayout implements C4BK {
    public int A00;
    public int A01;
    public Object A02;
    public ArrayList A03;
    public final C002301c A04;

    public C4GF(Context context) {
        super(context);
        this.A04 = C002301c.A00();
    }

    public void A00(ArrayList arrayList, C4BR c4br) {
        this.A03 = arrayList;
        addView((View) arrayList.get(0));
        ((C4GH) this.A03.get(0)).A0B = c4br;
        this.A00 = 0;
        this.A01 = getResources().getDisplayMetrics().widthPixels;
        int i = 1;
        while (true) {
            ArrayList arrayList2 = this.A03;
            if (i >= arrayList2.size()) {
                return;
            }
            C4GH c4gh = (C4GH) arrayList2.get(i);
            c4gh.A0B = c4br;
            c4gh.setX(this.A01);
            addView(c4gh);
            i++;
        }
    }

    @Override // X.C4BK
    public boolean A7v() {
        ArrayList arrayList;
        String inputValue = ((C4GH) this.A03.get(this.A00)).getInputValue();
        ArrayList arrayList2 = this.A03;
        int i = this.A00;
        boolean z = false;
        if (((C4GH) arrayList2.get(i)).A00 == inputValue.length()) {
            if (i == arrayList2.size() - 1) {
                ((View) arrayList2.get(i)).requestFocus();
                int i2 = 0;
                while (true) {
                    ArrayList arrayList3 = this.A03;
                    if (i2 >= arrayList3.size()) {
                        return true;
                    }
                    if (((C4GH) arrayList3.get(i2)).getInputValue().equals(inputValue)) {
                        i2++;
                    } else {
                        int i3 = 0;
                        while (true) {
                            arrayList = this.A03;
                            if (i3 >= arrayList.size()) {
                                break;
                            }
                            ((C4GH) arrayList.get(i3)).setText("");
                            i3++;
                        }
                        int i4 = this.A00;
                        if (i4 != 0) {
                            ((View) arrayList.get(i4)).animate().x(this.A01);
                            ((View) this.A03.get(this.A00 - 1)).animate().x(0.0f);
                            int i5 = this.A00 - 1;
                            this.A00 = i5;
                            ((View) this.A03.get(i5)).requestFocus();
                        }
                        ((C4GH) this.A03.get(i2)).A0B.AKd(this, this.A04.A06(R.string.npci_info_pins_dont_match));
                        return false;
                    }
                }
            } else {
                if (i < arrayList2.size() - 1) {
                    ((View) arrayList2.get(i)).animate().x(-this.A01);
                    ((View) this.A03.get(this.A00 + 1)).animate().x(0.0f);
                    int i6 = this.A00 + 1;
                    this.A00 = i6;
                    ((View) this.A03.get(i6)).requestFocus();
                    z = true;
                }
                return !z;
            }
        } else {
            ((View) arrayList2.get(i)).requestFocus();
            return false;
        }
    }

    @Override // X.C4BK
    public void AVc(String str, Drawable drawable, View.OnClickListener onClickListener, int i, boolean z, boolean z2) {
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.A03;
            if (i2 >= arrayList.size()) {
                return;
            }
            ((C4GH) arrayList.get(i2)).AVc(str, drawable, onClickListener, i, z, z2);
            i2++;
        }
    }

    @Override // X.C4BK
    public boolean AVd() {
        return ((C4GH) this.A03.get(this.A00)).AVd();
    }

    @Override // X.C4BK
    public Object getFormDataTag() {
        Object obj = this.A02;
        return obj == null ? ((C4GH) this.A03.get(0)).getFormDataTag() : obj;
    }

    @Override // X.C4BK
    public String getInputValue() {
        return ((C4GH) this.A03.get(0)).getInputValue();
    }

    public void setFormDataTag(Object obj) {
        this.A02 = obj;
    }

    public void setText(String str) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.A03;
            if (i >= arrayList.size()) {
                return;
            }
            ((C4GH) arrayList.get(i)).setText(str);
            i++;
        }
    }
}
