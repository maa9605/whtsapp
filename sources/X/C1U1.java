package X;

import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.preference.ExpandButton;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import androidx.preference.PreferenceScreen;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.1U1  reason: invalid class name */
/* loaded from: classes.dex */
public class C1U1 extends AbstractC04890Mh implements InterfaceC14260mf {
    public PreferenceGroup A01;
    public List A03;
    public List A04;
    public List A05;
    public Runnable A02 = new Runnable() { // from class: X.0mp
        @Override // java.lang.Runnable
        public void run() {
            C1U1.this.A0I();
        }
    };
    public Handler A00 = new Handler();

    public C1U1(PreferenceGroup preferenceGroup) {
        this.A01 = preferenceGroup;
        PreferenceGroup preferenceGroup2 = this.A01;
        preferenceGroup2.A09 = this;
        this.A04 = new ArrayList();
        this.A05 = new ArrayList();
        this.A03 = new ArrayList();
        if (preferenceGroup2 instanceof PreferenceScreen) {
            A0B(true);
        } else {
            A0B(true);
        }
        A0I();
    }

    @Override // X.AbstractC04890Mh
    public long A00(int i) {
        if (super.A00) {
            return A0G(i).A00();
        }
        return -1L;
    }

    @Override // X.AbstractC04890Mh
    public int A0C() {
        return this.A05.size();
    }

    @Override // X.AbstractC04890Mh
    public int A0D(int i) {
        C14370mq c14370mq = new C14370mq(A0G(i));
        int indexOf = this.A03.indexOf(c14370mq);
        if (indexOf != -1) {
            return indexOf;
        }
        int size = this.A03.size();
        this.A03.add(c14370mq);
        return size;
    }

    @Override // X.AbstractC04890Mh
    public C0TS A0E(ViewGroup viewGroup, int i) {
        C14370mq c14370mq = (C14370mq) this.A03.get(i);
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        TypedArray obtainStyledAttributes = viewGroup.getContext().obtainStyledAttributes((AttributeSet) null, C14460mz.A0F);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        if (drawable == null) {
            drawable = C09L.A01(viewGroup.getContext(), 17301602);
        }
        obtainStyledAttributes.recycle();
        View inflate = from.inflate(c14370mq.A00, viewGroup, false);
        if (inflate.getBackground() == null) {
            inflate.setBackground(drawable);
        }
        ViewGroup viewGroup2 = (ViewGroup) inflate.findViewById(16908312);
        if (viewGroup2 != null) {
            int i2 = c14370mq.A01;
            if (i2 != 0) {
                from.inflate(i2, viewGroup2);
            } else {
                viewGroup2.setVisibility(8);
            }
        }
        return new C1U3(inflate);
    }

    @Override // X.AbstractC04890Mh
    public void A0F(C0TS c0ts, int i) {
        A0G(i).A0S((C1U3) c0ts);
    }

    public Preference A0G(int i) {
        if (i < 0 || i >= A0C()) {
            return null;
        }
        return (Preference) this.A05.get(i);
    }

    public final List A0H(final PreferenceGroup preferenceGroup) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int size = preferenceGroup.A02.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Preference preference = (Preference) preferenceGroup.A02.get(i2);
            if (preference.A0c) {
                int i3 = preferenceGroup.A01;
                boolean z = i3 != Integer.MAX_VALUE;
                if (z && i >= i3) {
                    arrayList2.add(preference);
                } else {
                    arrayList.add(preference);
                }
                if (preference instanceof PreferenceGroup) {
                    PreferenceGroup preferenceGroup2 = (PreferenceGroup) preference;
                    if (!preferenceGroup2.A0X()) {
                        continue;
                    } else if (z && preferenceGroup2.A01 != Integer.MAX_VALUE) {
                        throw new IllegalStateException("Nesting an expandable group inside of another expandable group is not supported!");
                    } else {
                        for (Object obj : A0H(preferenceGroup2)) {
                            int i4 = preferenceGroup.A01;
                            if (i4 == Integer.MAX_VALUE || i < i4) {
                                arrayList.add(obj);
                            } else {
                                arrayList2.add(obj);
                            }
                            i++;
                        }
                    }
                } else {
                    i++;
                }
            }
        }
        int i5 = preferenceGroup.A01;
        if (i5 != Integer.MAX_VALUE && i > i5) {
            ExpandButton expandButton = new ExpandButton(((Preference) preferenceGroup).A05, arrayList2, ((Preference) preferenceGroup).A04);
            expandButton.A0B = new InterfaceC14280mh() { // from class: X.1U0
                @Override // X.InterfaceC14280mh
                public boolean ANC(Preference preference2) {
                    PreferenceGroup preferenceGroup3 = preferenceGroup;
                    if (2147483647 != 2147483647 && !(!TextUtils.isEmpty(preferenceGroup3.A0L))) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(preferenceGroup3.getClass().getSimpleName());
                        sb.append(" should have a key defined if it contains an expandable preference");
                        Log.e("PreferenceGroup", sb.toString());
                    }
                    preferenceGroup3.A01 = Integer.MAX_VALUE;
                    C1U1 c1u1 = C1U1.this;
                    c1u1.A00.removeCallbacks(c1u1.A02);
                    c1u1.A00.post(c1u1.A02);
                    return true;
                }
            };
            arrayList.add(expandButton);
        }
        return arrayList;
    }

    public void A0I() {
        for (Preference preference : this.A04) {
            preference.A09 = null;
        }
        ArrayList arrayList = new ArrayList(this.A04.size());
        this.A04 = arrayList;
        A0J(arrayList, this.A01);
        this.A05 = A0H(this.A01);
        super.A01.A00();
        for (Object obj : this.A04) {
            if (obj == null) {
                throw null;
            }
        }
    }

    public final void A0J(List list, PreferenceGroup preferenceGroup) {
        synchronized (preferenceGroup) {
            Collections.sort(preferenceGroup.A02);
        }
        int size = preferenceGroup.A02.size();
        for (int i = 0; i < size; i++) {
            Preference preference = (Preference) preferenceGroup.A02.get(i);
            list.add(preference);
            C14370mq c14370mq = new C14370mq(preference);
            if (!this.A03.contains(c14370mq)) {
                this.A03.add(c14370mq);
            }
            if (preference instanceof PreferenceGroup) {
                PreferenceGroup preferenceGroup2 = (PreferenceGroup) preference;
                if (preferenceGroup2.A0X()) {
                    A0J(list, preferenceGroup2);
                }
            }
            preference.A09 = this;
        }
    }
}
