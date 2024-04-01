package androidx.preference;

import X.C14460mz;
import X.C1U3;
import X.C1U4;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.preference.SeekBarPreference;
import com.google.android.search.verification.client.R;

/* loaded from: classes.dex */
public class SeekBarPreference extends Preference {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public View.OnKeyListener A04;
    public SeekBar.OnSeekBarChangeListener A05;
    public SeekBar A06;
    public TextView A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;

    public SeekBarPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.seekBarPreferenceStyle, 0);
        this.A05 = new SeekBar.OnSeekBarChangeListener() { // from class: X.0n0
            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
                if (z) {
                    SeekBarPreference seekBarPreference = SeekBarPreference.this;
                    if (seekBarPreference.A0B || !seekBarPreference.A0A) {
                        seekBarPreference.A0U(seekBar);
                        return;
                    }
                }
                SeekBarPreference seekBarPreference2 = SeekBarPreference.this;
                int i2 = i + seekBarPreference2.A01;
                TextView textView = seekBarPreference2.A07;
                if (textView == null) {
                    return;
                }
                textView.setText(String.valueOf(i2));
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStartTrackingTouch(SeekBar seekBar) {
                SeekBarPreference.this.A0A = true;
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStopTrackingTouch(SeekBar seekBar) {
                SeekBarPreference seekBarPreference = SeekBarPreference.this;
                seekBarPreference.A0A = false;
                if (seekBar.getProgress() + seekBarPreference.A01 != seekBarPreference.A03) {
                    seekBarPreference.A0U(seekBar);
                }
            }
        };
        this.A04 = new View.OnKeyListener() { // from class: X.0n1
            @Override // android.view.View.OnKeyListener
            public boolean onKey(View view, int i, KeyEvent keyEvent) {
                if (keyEvent.getAction() != 0) {
                    return false;
                }
                SeekBarPreference seekBarPreference = SeekBarPreference.this;
                if ((!seekBarPreference.A08 && (i == 21 || i == 22)) || i == 23 || i == 66) {
                    return false;
                }
                SeekBar seekBar = seekBarPreference.A06;
                if (seekBar == null) {
                    Log.e("SeekBarPreference", "SeekBar view is null and hence cannot be adjusted.");
                    return false;
                }
                return seekBar.onKeyDown(i, keyEvent);
            }
        };
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C14460mz.A0o, R.attr.seekBarPreferenceStyle, 0);
        this.A01 = obtainStyledAttributes.getInt(3, 0);
        int i = obtainStyledAttributes.getInt(1, 100);
        int i2 = this.A01;
        i = i < i2 ? i2 : i;
        if (i != this.A00) {
            this.A00 = i;
            A05();
        }
        int i3 = obtainStyledAttributes.getInt(4, 0);
        if (i3 != this.A02) {
            this.A02 = Math.min(this.A00 - this.A01, Math.abs(i3));
            A05();
        }
        this.A08 = obtainStyledAttributes.getBoolean(2, true);
        this.A09 = obtainStyledAttributes.getBoolean(5, false);
        this.A0B = obtainStyledAttributes.getBoolean(6, false);
        obtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public Parcelable A01() {
        Parcelable A01 = super.A01();
        if (this.A0X) {
            return A01;
        }
        C1U4 c1u4 = new C1U4(A01);
        c1u4.A02 = this.A03;
        c1u4.A01 = this.A01;
        c1u4.A00 = this.A00;
        return c1u4;
    }

    @Override // androidx.preference.Preference
    public Object A03(TypedArray typedArray, int i) {
        return Integer.valueOf(typedArray.getInt(i, 0));
    }

    @Override // androidx.preference.Preference
    public void A0D(Parcelable parcelable) {
        if (!parcelable.getClass().equals(C1U4.class)) {
            super.A0D(parcelable);
            return;
        }
        C1U4 c1u4 = (C1U4) parcelable;
        super.A0D(c1u4.getSuperState());
        this.A03 = c1u4.A02;
        this.A01 = c1u4.A01;
        this.A00 = c1u4.A00;
        A05();
    }

    @Override // androidx.preference.Preference
    public void A0K(Object obj) {
        if (obj == null) {
            obj = 0;
        }
        int intValue = ((Number) obj).intValue();
        if (A0Q()) {
            intValue = this.A0F.A03().getInt(this.A0L, intValue);
        }
        A0T(intValue, true);
    }

    @Override // androidx.preference.Preference
    public void A0S(C1U3 c1u3) {
        super.A0S(c1u3);
        c1u3.A0H.setOnKeyListener(this.A04);
        this.A06 = (SeekBar) c1u3.A0C(R.id.seekbar);
        TextView textView = (TextView) c1u3.A0C(R.id.seekbar_value);
        this.A07 = textView;
        if (this.A09) {
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
            this.A07 = null;
        }
        SeekBar seekBar = this.A06;
        if (seekBar == null) {
            Log.e("SeekBarPreference", "SeekBar view is null in onBindViewHolder.");
            return;
        }
        seekBar.setOnSeekBarChangeListener(this.A05);
        this.A06.setMax(this.A00 - this.A01);
        int i = this.A02;
        if (i != 0) {
            this.A06.setKeyProgressIncrement(i);
        } else {
            this.A02 = this.A06.getKeyProgressIncrement();
        }
        this.A06.setProgress(this.A03 - this.A01);
        int i2 = this.A03;
        TextView textView2 = this.A07;
        if (textView2 != null) {
            textView2.setText(String.valueOf(i2));
        }
        this.A06.setEnabled(A0O());
    }

    public final void A0T(int i, boolean z) {
        int i2 = this.A01;
        if (i < i2) {
            i = i2;
        }
        int i3 = this.A00;
        if (i > i3) {
            i = i3;
        }
        if (i != this.A03) {
            this.A03 = i;
            TextView textView = this.A07;
            if (textView != null) {
                textView.setText(String.valueOf(i));
            }
            if (A0Q()) {
                int i4 = i ^ (-1);
                if (A0Q()) {
                    i4 = this.A0F.A03().getInt(this.A0L, i4);
                }
                if (i != i4) {
                    SharedPreferences.Editor A02 = this.A0F.A02();
                    A02.putInt(this.A0L, i);
                    if (!this.A0F.A09) {
                        A02.apply();
                    }
                }
            }
            if (z) {
                A05();
            }
        }
    }

    public void A0U(SeekBar seekBar) {
        int progress = seekBar.getProgress() + this.A01;
        if (progress != this.A03) {
            if (A0R(Integer.valueOf(progress))) {
                A0T(progress, false);
                return;
            }
            seekBar.setProgress(this.A03 - this.A01);
            int i = this.A03;
            TextView textView = this.A07;
            if (textView == null) {
                return;
            }
            textView.setText(String.valueOf(i));
        }
    }
}
