package X;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.search.verification.client.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.30O */
/* loaded from: classes2.dex */
public class C30O {
    public static C2K1[] A00 = {new C2K1(6) { // from class: X.3HR
        public final int A00;

        @Override // X.C2K1
        public int ACY(boolean z) {
            return z ? 1 : 0;
        }

        {
            this.A00 = r1;
        }

        @Override // X.C2K1
        public boolean A5u(C43811y1 c43811y1) {
            return !c43811y1.A01;
        }

        @Override // X.C2K1
        public C2HG A6w(Context context, C002301c c002301c, boolean z) {
            switch (this.A00) {
                case 0:
                    return new C3HV();
                case 1:
                    return new C3HZ();
                case 2:
                    return new C67843Hb();
                case 3:
                    return new C67893Hg();
                case 4:
                    return new C67853Hc();
                case 5:
                    return new C67863Hd();
                case 6:
                    return new C2HH(context, c002301c, z);
                case 7:
                    return new C2HJ(context, c002301c, z);
                case 8:
                    return new C3La(context, c002301c, z, context.getString(R.string.attach_location));
                default:
                    return null;
            }
        }

        @Override // X.C2K1
        public String A97(Context context) {
            int i;
            switch (this.A00) {
                case 0:
                    i = R.string.doodle_item_arrow;
                    break;
                case 1:
                    i = R.string.doodle_item_oval;
                    break;
                case 2:
                    i = R.string.doodle_item_rectangle;
                    break;
                case 3:
                    i = R.string.doodle_item_thought_bubble;
                    break;
                case 4:
                    i = R.string.doodle_item_oval_bubble;
                    break;
                case 5:
                    i = R.string.doodle_item_rectangular_bubble;
                    break;
                case 6:
                    i = R.string.doodle_item_digital_clock;
                    break;
                case 7:
                    i = R.string.doodle_item_analog_clock;
                    break;
                case 8:
                    i = R.string.doodle_item_location;
                    break;
                default:
                    i = R.string.emoji_button_description;
                    break;
            }
            return context.getString(i);
        }

        @Override // X.C2K1
        public C2CI[] A9v() {
            switch (this.A00) {
                case 0:
                    return new C2CI[]{new C2CI(new int[]{8599})};
                case 1:
                    return new C2CI[]{new C2CI(new int[]{11093})};
                case 2:
                    return new C2CI[]{new C2CI(new int[]{128306})};
                case 3:
                    return new C2CI[]{new C2CI(new int[]{128173})};
                case 4:
                case 5:
                    return new C2CI[]{new C2CI(new int[]{128172})};
                case 6:
                case 7:
                    return new C2CI[]{new C2CI(new int[]{128346})};
                case 8:
                    return new C2CI[]{new C2CI(new int[]{128205})};
                default:
                    return C2K1.A00;
            }
        }

        @Override // X.C2K1
        public int ABm(Context context, int i) {
            int i2 = this.A00;
            if (i2 != 6) {
                if (i2 == 7 && i == 1) {
                    return context.getResources().getDimensionPixelSize(R.dimen.doodle_shape_picker_large_clock_grid_padding);
                }
                return context.getResources().getDimensionPixelSize(R.dimen.doodle_shape_picker_custom_grid_padding);
            }
            Resources resources = context.getResources();
            if (i == 1) {
                return resources.getDimensionPixelSize(R.dimen.doodle_shape_picker_large_clock_grid_padding);
            }
            return resources.getDimensionPixelSize(R.dimen.doodle_shape_picker_grid_padding);
        }

        @Override // X.C2K1
        public String ADR() {
            StringBuilder A0P = C000200d.A0P("custom:");
            A0P.append(this.A00);
            return A0P.toString();
        }

        @Override // X.C2K1
        public boolean ARe() {
            int i = this.A00;
            return i == 7 || i == 8;
        }
    }, new C2K1(7) { // from class: X.3HR
        public final int A00;

        @Override // X.C2K1
        public int ACY(boolean z) {
            return z ? 1 : 0;
        }

        {
            this.A00 = r1;
        }

        @Override // X.C2K1
        public boolean A5u(C43811y1 c43811y1) {
            return !c43811y1.A01;
        }

        @Override // X.C2K1
        public C2HG A6w(Context context, C002301c c002301c, boolean z) {
            switch (this.A00) {
                case 0:
                    return new C3HV();
                case 1:
                    return new C3HZ();
                case 2:
                    return new C67843Hb();
                case 3:
                    return new C67893Hg();
                case 4:
                    return new C67853Hc();
                case 5:
                    return new C67863Hd();
                case 6:
                    return new C2HH(context, c002301c, z);
                case 7:
                    return new C2HJ(context, c002301c, z);
                case 8:
                    return new C3La(context, c002301c, z, context.getString(R.string.attach_location));
                default:
                    return null;
            }
        }

        @Override // X.C2K1
        public String A97(Context context) {
            int i;
            switch (this.A00) {
                case 0:
                    i = R.string.doodle_item_arrow;
                    break;
                case 1:
                    i = R.string.doodle_item_oval;
                    break;
                case 2:
                    i = R.string.doodle_item_rectangle;
                    break;
                case 3:
                    i = R.string.doodle_item_thought_bubble;
                    break;
                case 4:
                    i = R.string.doodle_item_oval_bubble;
                    break;
                case 5:
                    i = R.string.doodle_item_rectangular_bubble;
                    break;
                case 6:
                    i = R.string.doodle_item_digital_clock;
                    break;
                case 7:
                    i = R.string.doodle_item_analog_clock;
                    break;
                case 8:
                    i = R.string.doodle_item_location;
                    break;
                default:
                    i = R.string.emoji_button_description;
                    break;
            }
            return context.getString(i);
        }

        @Override // X.C2K1
        public C2CI[] A9v() {
            switch (this.A00) {
                case 0:
                    return new C2CI[]{new C2CI(new int[]{8599})};
                case 1:
                    return new C2CI[]{new C2CI(new int[]{11093})};
                case 2:
                    return new C2CI[]{new C2CI(new int[]{128306})};
                case 3:
                    return new C2CI[]{new C2CI(new int[]{128173})};
                case 4:
                case 5:
                    return new C2CI[]{new C2CI(new int[]{128172})};
                case 6:
                case 7:
                    return new C2CI[]{new C2CI(new int[]{128346})};
                case 8:
                    return new C2CI[]{new C2CI(new int[]{128205})};
                default:
                    return C2K1.A00;
            }
        }

        @Override // X.C2K1
        public int ABm(Context context, int i) {
            int i2 = this.A00;
            if (i2 != 6) {
                if (i2 == 7 && i == 1) {
                    return context.getResources().getDimensionPixelSize(R.dimen.doodle_shape_picker_large_clock_grid_padding);
                }
                return context.getResources().getDimensionPixelSize(R.dimen.doodle_shape_picker_custom_grid_padding);
            }
            Resources resources = context.getResources();
            if (i == 1) {
                return resources.getDimensionPixelSize(R.dimen.doodle_shape_picker_large_clock_grid_padding);
            }
            return resources.getDimensionPixelSize(R.dimen.doodle_shape_picker_grid_padding);
        }

        @Override // X.C2K1
        public String ADR() {
            StringBuilder A0P = C000200d.A0P("custom:");
            A0P.append(this.A00);
            return A0P.toString();
        }

        @Override // X.C2K1
        public boolean ARe() {
            int i = this.A00;
            return i == 7 || i == 8;
        }
    }, new C2K1(8) { // from class: X.3HR
        public final int A00;

        @Override // X.C2K1
        public int ACY(boolean z) {
            return z ? 1 : 0;
        }

        {
            this.A00 = r1;
        }

        @Override // X.C2K1
        public boolean A5u(C43811y1 c43811y1) {
            return !c43811y1.A01;
        }

        @Override // X.C2K1
        public C2HG A6w(Context context, C002301c c002301c, boolean z) {
            switch (this.A00) {
                case 0:
                    return new C3HV();
                case 1:
                    return new C3HZ();
                case 2:
                    return new C67843Hb();
                case 3:
                    return new C67893Hg();
                case 4:
                    return new C67853Hc();
                case 5:
                    return new C67863Hd();
                case 6:
                    return new C2HH(context, c002301c, z);
                case 7:
                    return new C2HJ(context, c002301c, z);
                case 8:
                    return new C3La(context, c002301c, z, context.getString(R.string.attach_location));
                default:
                    return null;
            }
        }

        @Override // X.C2K1
        public String A97(Context context) {
            int i;
            switch (this.A00) {
                case 0:
                    i = R.string.doodle_item_arrow;
                    break;
                case 1:
                    i = R.string.doodle_item_oval;
                    break;
                case 2:
                    i = R.string.doodle_item_rectangle;
                    break;
                case 3:
                    i = R.string.doodle_item_thought_bubble;
                    break;
                case 4:
                    i = R.string.doodle_item_oval_bubble;
                    break;
                case 5:
                    i = R.string.doodle_item_rectangular_bubble;
                    break;
                case 6:
                    i = R.string.doodle_item_digital_clock;
                    break;
                case 7:
                    i = R.string.doodle_item_analog_clock;
                    break;
                case 8:
                    i = R.string.doodle_item_location;
                    break;
                default:
                    i = R.string.emoji_button_description;
                    break;
            }
            return context.getString(i);
        }

        @Override // X.C2K1
        public C2CI[] A9v() {
            switch (this.A00) {
                case 0:
                    return new C2CI[]{new C2CI(new int[]{8599})};
                case 1:
                    return new C2CI[]{new C2CI(new int[]{11093})};
                case 2:
                    return new C2CI[]{new C2CI(new int[]{128306})};
                case 3:
                    return new C2CI[]{new C2CI(new int[]{128173})};
                case 4:
                case 5:
                    return new C2CI[]{new C2CI(new int[]{128172})};
                case 6:
                case 7:
                    return new C2CI[]{new C2CI(new int[]{128346})};
                case 8:
                    return new C2CI[]{new C2CI(new int[]{128205})};
                default:
                    return C2K1.A00;
            }
        }

        @Override // X.C2K1
        public int ABm(Context context, int i) {
            int i2 = this.A00;
            if (i2 != 6) {
                if (i2 == 7 && i == 1) {
                    return context.getResources().getDimensionPixelSize(R.dimen.doodle_shape_picker_large_clock_grid_padding);
                }
                return context.getResources().getDimensionPixelSize(R.dimen.doodle_shape_picker_custom_grid_padding);
            }
            Resources resources = context.getResources();
            if (i == 1) {
                return resources.getDimensionPixelSize(R.dimen.doodle_shape_picker_large_clock_grid_padding);
            }
            return resources.getDimensionPixelSize(R.dimen.doodle_shape_picker_grid_padding);
        }

        @Override // X.C2K1
        public String ADR() {
            StringBuilder A0P = C000200d.A0P("custom:");
            A0P.append(this.A00);
            return A0P.toString();
        }

        @Override // X.C2K1
        public boolean ARe() {
            int i = this.A00;
            return i == 7 || i == 8;
        }
    }};
    public static C2K1[] A01 = {new C2K1(0) { // from class: X.3HR
        public final int A00;

        @Override // X.C2K1
        public int ACY(boolean z) {
            return z ? 1 : 0;
        }

        {
            this.A00 = r1;
        }

        @Override // X.C2K1
        public boolean A5u(C43811y1 c43811y1) {
            return !c43811y1.A01;
        }

        @Override // X.C2K1
        public C2HG A6w(Context context, C002301c c002301c, boolean z) {
            switch (this.A00) {
                case 0:
                    return new C3HV();
                case 1:
                    return new C3HZ();
                case 2:
                    return new C67843Hb();
                case 3:
                    return new C67893Hg();
                case 4:
                    return new C67853Hc();
                case 5:
                    return new C67863Hd();
                case 6:
                    return new C2HH(context, c002301c, z);
                case 7:
                    return new C2HJ(context, c002301c, z);
                case 8:
                    return new C3La(context, c002301c, z, context.getString(R.string.attach_location));
                default:
                    return null;
            }
        }

        @Override // X.C2K1
        public String A97(Context context) {
            int i;
            switch (this.A00) {
                case 0:
                    i = R.string.doodle_item_arrow;
                    break;
                case 1:
                    i = R.string.doodle_item_oval;
                    break;
                case 2:
                    i = R.string.doodle_item_rectangle;
                    break;
                case 3:
                    i = R.string.doodle_item_thought_bubble;
                    break;
                case 4:
                    i = R.string.doodle_item_oval_bubble;
                    break;
                case 5:
                    i = R.string.doodle_item_rectangular_bubble;
                    break;
                case 6:
                    i = R.string.doodle_item_digital_clock;
                    break;
                case 7:
                    i = R.string.doodle_item_analog_clock;
                    break;
                case 8:
                    i = R.string.doodle_item_location;
                    break;
                default:
                    i = R.string.emoji_button_description;
                    break;
            }
            return context.getString(i);
        }

        @Override // X.C2K1
        public C2CI[] A9v() {
            switch (this.A00) {
                case 0:
                    return new C2CI[]{new C2CI(new int[]{8599})};
                case 1:
                    return new C2CI[]{new C2CI(new int[]{11093})};
                case 2:
                    return new C2CI[]{new C2CI(new int[]{128306})};
                case 3:
                    return new C2CI[]{new C2CI(new int[]{128173})};
                case 4:
                case 5:
                    return new C2CI[]{new C2CI(new int[]{128172})};
                case 6:
                case 7:
                    return new C2CI[]{new C2CI(new int[]{128346})};
                case 8:
                    return new C2CI[]{new C2CI(new int[]{128205})};
                default:
                    return C2K1.A00;
            }
        }

        @Override // X.C2K1
        public int ABm(Context context, int i) {
            int i2 = this.A00;
            if (i2 != 6) {
                if (i2 == 7 && i == 1) {
                    return context.getResources().getDimensionPixelSize(R.dimen.doodle_shape_picker_large_clock_grid_padding);
                }
                return context.getResources().getDimensionPixelSize(R.dimen.doodle_shape_picker_custom_grid_padding);
            }
            Resources resources = context.getResources();
            if (i == 1) {
                return resources.getDimensionPixelSize(R.dimen.doodle_shape_picker_large_clock_grid_padding);
            }
            return resources.getDimensionPixelSize(R.dimen.doodle_shape_picker_grid_padding);
        }

        @Override // X.C2K1
        public String ADR() {
            StringBuilder A0P = C000200d.A0P("custom:");
            A0P.append(this.A00);
            return A0P.toString();
        }

        @Override // X.C2K1
        public boolean ARe() {
            int i = this.A00;
            return i == 7 || i == 8;
        }
    }, new C2K1(1) { // from class: X.3HR
        public final int A00;

        @Override // X.C2K1
        public int ACY(boolean z) {
            return z ? 1 : 0;
        }

        {
            this.A00 = r1;
        }

        @Override // X.C2K1
        public boolean A5u(C43811y1 c43811y1) {
            return !c43811y1.A01;
        }

        @Override // X.C2K1
        public C2HG A6w(Context context, C002301c c002301c, boolean z) {
            switch (this.A00) {
                case 0:
                    return new C3HV();
                case 1:
                    return new C3HZ();
                case 2:
                    return new C67843Hb();
                case 3:
                    return new C67893Hg();
                case 4:
                    return new C67853Hc();
                case 5:
                    return new C67863Hd();
                case 6:
                    return new C2HH(context, c002301c, z);
                case 7:
                    return new C2HJ(context, c002301c, z);
                case 8:
                    return new C3La(context, c002301c, z, context.getString(R.string.attach_location));
                default:
                    return null;
            }
        }

        @Override // X.C2K1
        public String A97(Context context) {
            int i;
            switch (this.A00) {
                case 0:
                    i = R.string.doodle_item_arrow;
                    break;
                case 1:
                    i = R.string.doodle_item_oval;
                    break;
                case 2:
                    i = R.string.doodle_item_rectangle;
                    break;
                case 3:
                    i = R.string.doodle_item_thought_bubble;
                    break;
                case 4:
                    i = R.string.doodle_item_oval_bubble;
                    break;
                case 5:
                    i = R.string.doodle_item_rectangular_bubble;
                    break;
                case 6:
                    i = R.string.doodle_item_digital_clock;
                    break;
                case 7:
                    i = R.string.doodle_item_analog_clock;
                    break;
                case 8:
                    i = R.string.doodle_item_location;
                    break;
                default:
                    i = R.string.emoji_button_description;
                    break;
            }
            return context.getString(i);
        }

        @Override // X.C2K1
        public C2CI[] A9v() {
            switch (this.A00) {
                case 0:
                    return new C2CI[]{new C2CI(new int[]{8599})};
                case 1:
                    return new C2CI[]{new C2CI(new int[]{11093})};
                case 2:
                    return new C2CI[]{new C2CI(new int[]{128306})};
                case 3:
                    return new C2CI[]{new C2CI(new int[]{128173})};
                case 4:
                case 5:
                    return new C2CI[]{new C2CI(new int[]{128172})};
                case 6:
                case 7:
                    return new C2CI[]{new C2CI(new int[]{128346})};
                case 8:
                    return new C2CI[]{new C2CI(new int[]{128205})};
                default:
                    return C2K1.A00;
            }
        }

        @Override // X.C2K1
        public int ABm(Context context, int i) {
            int i2 = this.A00;
            if (i2 != 6) {
                if (i2 == 7 && i == 1) {
                    return context.getResources().getDimensionPixelSize(R.dimen.doodle_shape_picker_large_clock_grid_padding);
                }
                return context.getResources().getDimensionPixelSize(R.dimen.doodle_shape_picker_custom_grid_padding);
            }
            Resources resources = context.getResources();
            if (i == 1) {
                return resources.getDimensionPixelSize(R.dimen.doodle_shape_picker_large_clock_grid_padding);
            }
            return resources.getDimensionPixelSize(R.dimen.doodle_shape_picker_grid_padding);
        }

        @Override // X.C2K1
        public String ADR() {
            StringBuilder A0P = C000200d.A0P("custom:");
            A0P.append(this.A00);
            return A0P.toString();
        }

        @Override // X.C2K1
        public boolean ARe() {
            int i = this.A00;
            return i == 7 || i == 8;
        }
    }, new C2K1(2) { // from class: X.3HR
        public final int A00;

        @Override // X.C2K1
        public int ACY(boolean z) {
            return z ? 1 : 0;
        }

        {
            this.A00 = r1;
        }

        @Override // X.C2K1
        public boolean A5u(C43811y1 c43811y1) {
            return !c43811y1.A01;
        }

        @Override // X.C2K1
        public C2HG A6w(Context context, C002301c c002301c, boolean z) {
            switch (this.A00) {
                case 0:
                    return new C3HV();
                case 1:
                    return new C3HZ();
                case 2:
                    return new C67843Hb();
                case 3:
                    return new C67893Hg();
                case 4:
                    return new C67853Hc();
                case 5:
                    return new C67863Hd();
                case 6:
                    return new C2HH(context, c002301c, z);
                case 7:
                    return new C2HJ(context, c002301c, z);
                case 8:
                    return new C3La(context, c002301c, z, context.getString(R.string.attach_location));
                default:
                    return null;
            }
        }

        @Override // X.C2K1
        public String A97(Context context) {
            int i;
            switch (this.A00) {
                case 0:
                    i = R.string.doodle_item_arrow;
                    break;
                case 1:
                    i = R.string.doodle_item_oval;
                    break;
                case 2:
                    i = R.string.doodle_item_rectangle;
                    break;
                case 3:
                    i = R.string.doodle_item_thought_bubble;
                    break;
                case 4:
                    i = R.string.doodle_item_oval_bubble;
                    break;
                case 5:
                    i = R.string.doodle_item_rectangular_bubble;
                    break;
                case 6:
                    i = R.string.doodle_item_digital_clock;
                    break;
                case 7:
                    i = R.string.doodle_item_analog_clock;
                    break;
                case 8:
                    i = R.string.doodle_item_location;
                    break;
                default:
                    i = R.string.emoji_button_description;
                    break;
            }
            return context.getString(i);
        }

        @Override // X.C2K1
        public C2CI[] A9v() {
            switch (this.A00) {
                case 0:
                    return new C2CI[]{new C2CI(new int[]{8599})};
                case 1:
                    return new C2CI[]{new C2CI(new int[]{11093})};
                case 2:
                    return new C2CI[]{new C2CI(new int[]{128306})};
                case 3:
                    return new C2CI[]{new C2CI(new int[]{128173})};
                case 4:
                case 5:
                    return new C2CI[]{new C2CI(new int[]{128172})};
                case 6:
                case 7:
                    return new C2CI[]{new C2CI(new int[]{128346})};
                case 8:
                    return new C2CI[]{new C2CI(new int[]{128205})};
                default:
                    return C2K1.A00;
            }
        }

        @Override // X.C2K1
        public int ABm(Context context, int i) {
            int i2 = this.A00;
            if (i2 != 6) {
                if (i2 == 7 && i == 1) {
                    return context.getResources().getDimensionPixelSize(R.dimen.doodle_shape_picker_large_clock_grid_padding);
                }
                return context.getResources().getDimensionPixelSize(R.dimen.doodle_shape_picker_custom_grid_padding);
            }
            Resources resources = context.getResources();
            if (i == 1) {
                return resources.getDimensionPixelSize(R.dimen.doodle_shape_picker_large_clock_grid_padding);
            }
            return resources.getDimensionPixelSize(R.dimen.doodle_shape_picker_grid_padding);
        }

        @Override // X.C2K1
        public String ADR() {
            StringBuilder A0P = C000200d.A0P("custom:");
            A0P.append(this.A00);
            return A0P.toString();
        }

        @Override // X.C2K1
        public boolean ARe() {
            int i = this.A00;
            return i == 7 || i == 8;
        }
    }, new C2K1(3) { // from class: X.3HR
        public final int A00;

        @Override // X.C2K1
        public int ACY(boolean z) {
            return z ? 1 : 0;
        }

        {
            this.A00 = r1;
        }

        @Override // X.C2K1
        public boolean A5u(C43811y1 c43811y1) {
            return !c43811y1.A01;
        }

        @Override // X.C2K1
        public C2HG A6w(Context context, C002301c c002301c, boolean z) {
            switch (this.A00) {
                case 0:
                    return new C3HV();
                case 1:
                    return new C3HZ();
                case 2:
                    return new C67843Hb();
                case 3:
                    return new C67893Hg();
                case 4:
                    return new C67853Hc();
                case 5:
                    return new C67863Hd();
                case 6:
                    return new C2HH(context, c002301c, z);
                case 7:
                    return new C2HJ(context, c002301c, z);
                case 8:
                    return new C3La(context, c002301c, z, context.getString(R.string.attach_location));
                default:
                    return null;
            }
        }

        @Override // X.C2K1
        public String A97(Context context) {
            int i;
            switch (this.A00) {
                case 0:
                    i = R.string.doodle_item_arrow;
                    break;
                case 1:
                    i = R.string.doodle_item_oval;
                    break;
                case 2:
                    i = R.string.doodle_item_rectangle;
                    break;
                case 3:
                    i = R.string.doodle_item_thought_bubble;
                    break;
                case 4:
                    i = R.string.doodle_item_oval_bubble;
                    break;
                case 5:
                    i = R.string.doodle_item_rectangular_bubble;
                    break;
                case 6:
                    i = R.string.doodle_item_digital_clock;
                    break;
                case 7:
                    i = R.string.doodle_item_analog_clock;
                    break;
                case 8:
                    i = R.string.doodle_item_location;
                    break;
                default:
                    i = R.string.emoji_button_description;
                    break;
            }
            return context.getString(i);
        }

        @Override // X.C2K1
        public C2CI[] A9v() {
            switch (this.A00) {
                case 0:
                    return new C2CI[]{new C2CI(new int[]{8599})};
                case 1:
                    return new C2CI[]{new C2CI(new int[]{11093})};
                case 2:
                    return new C2CI[]{new C2CI(new int[]{128306})};
                case 3:
                    return new C2CI[]{new C2CI(new int[]{128173})};
                case 4:
                case 5:
                    return new C2CI[]{new C2CI(new int[]{128172})};
                case 6:
                case 7:
                    return new C2CI[]{new C2CI(new int[]{128346})};
                case 8:
                    return new C2CI[]{new C2CI(new int[]{128205})};
                default:
                    return C2K1.A00;
            }
        }

        @Override // X.C2K1
        public int ABm(Context context, int i) {
            int i2 = this.A00;
            if (i2 != 6) {
                if (i2 == 7 && i == 1) {
                    return context.getResources().getDimensionPixelSize(R.dimen.doodle_shape_picker_large_clock_grid_padding);
                }
                return context.getResources().getDimensionPixelSize(R.dimen.doodle_shape_picker_custom_grid_padding);
            }
            Resources resources = context.getResources();
            if (i == 1) {
                return resources.getDimensionPixelSize(R.dimen.doodle_shape_picker_large_clock_grid_padding);
            }
            return resources.getDimensionPixelSize(R.dimen.doodle_shape_picker_grid_padding);
        }

        @Override // X.C2K1
        public String ADR() {
            StringBuilder A0P = C000200d.A0P("custom:");
            A0P.append(this.A00);
            return A0P.toString();
        }

        @Override // X.C2K1
        public boolean ARe() {
            int i = this.A00;
            return i == 7 || i == 8;
        }
    }, new C2K1(4) { // from class: X.3HR
        public final int A00;

        @Override // X.C2K1
        public int ACY(boolean z) {
            return z ? 1 : 0;
        }

        {
            this.A00 = r1;
        }

        @Override // X.C2K1
        public boolean A5u(C43811y1 c43811y1) {
            return !c43811y1.A01;
        }

        @Override // X.C2K1
        public C2HG A6w(Context context, C002301c c002301c, boolean z) {
            switch (this.A00) {
                case 0:
                    return new C3HV();
                case 1:
                    return new C3HZ();
                case 2:
                    return new C67843Hb();
                case 3:
                    return new C67893Hg();
                case 4:
                    return new C67853Hc();
                case 5:
                    return new C67863Hd();
                case 6:
                    return new C2HH(context, c002301c, z);
                case 7:
                    return new C2HJ(context, c002301c, z);
                case 8:
                    return new C3La(context, c002301c, z, context.getString(R.string.attach_location));
                default:
                    return null;
            }
        }

        @Override // X.C2K1
        public String A97(Context context) {
            int i;
            switch (this.A00) {
                case 0:
                    i = R.string.doodle_item_arrow;
                    break;
                case 1:
                    i = R.string.doodle_item_oval;
                    break;
                case 2:
                    i = R.string.doodle_item_rectangle;
                    break;
                case 3:
                    i = R.string.doodle_item_thought_bubble;
                    break;
                case 4:
                    i = R.string.doodle_item_oval_bubble;
                    break;
                case 5:
                    i = R.string.doodle_item_rectangular_bubble;
                    break;
                case 6:
                    i = R.string.doodle_item_digital_clock;
                    break;
                case 7:
                    i = R.string.doodle_item_analog_clock;
                    break;
                case 8:
                    i = R.string.doodle_item_location;
                    break;
                default:
                    i = R.string.emoji_button_description;
                    break;
            }
            return context.getString(i);
        }

        @Override // X.C2K1
        public C2CI[] A9v() {
            switch (this.A00) {
                case 0:
                    return new C2CI[]{new C2CI(new int[]{8599})};
                case 1:
                    return new C2CI[]{new C2CI(new int[]{11093})};
                case 2:
                    return new C2CI[]{new C2CI(new int[]{128306})};
                case 3:
                    return new C2CI[]{new C2CI(new int[]{128173})};
                case 4:
                case 5:
                    return new C2CI[]{new C2CI(new int[]{128172})};
                case 6:
                case 7:
                    return new C2CI[]{new C2CI(new int[]{128346})};
                case 8:
                    return new C2CI[]{new C2CI(new int[]{128205})};
                default:
                    return C2K1.A00;
            }
        }

        @Override // X.C2K1
        public int ABm(Context context, int i) {
            int i2 = this.A00;
            if (i2 != 6) {
                if (i2 == 7 && i == 1) {
                    return context.getResources().getDimensionPixelSize(R.dimen.doodle_shape_picker_large_clock_grid_padding);
                }
                return context.getResources().getDimensionPixelSize(R.dimen.doodle_shape_picker_custom_grid_padding);
            }
            Resources resources = context.getResources();
            if (i == 1) {
                return resources.getDimensionPixelSize(R.dimen.doodle_shape_picker_large_clock_grid_padding);
            }
            return resources.getDimensionPixelSize(R.dimen.doodle_shape_picker_grid_padding);
        }

        @Override // X.C2K1
        public String ADR() {
            StringBuilder A0P = C000200d.A0P("custom:");
            A0P.append(this.A00);
            return A0P.toString();
        }

        @Override // X.C2K1
        public boolean ARe() {
            int i = this.A00;
            return i == 7 || i == 8;
        }
    }, new C2K1(5) { // from class: X.3HR
        public final int A00;

        @Override // X.C2K1
        public int ACY(boolean z) {
            return z ? 1 : 0;
        }

        {
            this.A00 = r1;
        }

        @Override // X.C2K1
        public boolean A5u(C43811y1 c43811y1) {
            return !c43811y1.A01;
        }

        @Override // X.C2K1
        public C2HG A6w(Context context, C002301c c002301c, boolean z) {
            switch (this.A00) {
                case 0:
                    return new C3HV();
                case 1:
                    return new C3HZ();
                case 2:
                    return new C67843Hb();
                case 3:
                    return new C67893Hg();
                case 4:
                    return new C67853Hc();
                case 5:
                    return new C67863Hd();
                case 6:
                    return new C2HH(context, c002301c, z);
                case 7:
                    return new C2HJ(context, c002301c, z);
                case 8:
                    return new C3La(context, c002301c, z, context.getString(R.string.attach_location));
                default:
                    return null;
            }
        }

        @Override // X.C2K1
        public String A97(Context context) {
            int i;
            switch (this.A00) {
                case 0:
                    i = R.string.doodle_item_arrow;
                    break;
                case 1:
                    i = R.string.doodle_item_oval;
                    break;
                case 2:
                    i = R.string.doodle_item_rectangle;
                    break;
                case 3:
                    i = R.string.doodle_item_thought_bubble;
                    break;
                case 4:
                    i = R.string.doodle_item_oval_bubble;
                    break;
                case 5:
                    i = R.string.doodle_item_rectangular_bubble;
                    break;
                case 6:
                    i = R.string.doodle_item_digital_clock;
                    break;
                case 7:
                    i = R.string.doodle_item_analog_clock;
                    break;
                case 8:
                    i = R.string.doodle_item_location;
                    break;
                default:
                    i = R.string.emoji_button_description;
                    break;
            }
            return context.getString(i);
        }

        @Override // X.C2K1
        public C2CI[] A9v() {
            switch (this.A00) {
                case 0:
                    return new C2CI[]{new C2CI(new int[]{8599})};
                case 1:
                    return new C2CI[]{new C2CI(new int[]{11093})};
                case 2:
                    return new C2CI[]{new C2CI(new int[]{128306})};
                case 3:
                    return new C2CI[]{new C2CI(new int[]{128173})};
                case 4:
                case 5:
                    return new C2CI[]{new C2CI(new int[]{128172})};
                case 6:
                case 7:
                    return new C2CI[]{new C2CI(new int[]{128346})};
                case 8:
                    return new C2CI[]{new C2CI(new int[]{128205})};
                default:
                    return C2K1.A00;
            }
        }

        @Override // X.C2K1
        public int ABm(Context context, int i) {
            int i2 = this.A00;
            if (i2 != 6) {
                if (i2 == 7 && i == 1) {
                    return context.getResources().getDimensionPixelSize(R.dimen.doodle_shape_picker_large_clock_grid_padding);
                }
                return context.getResources().getDimensionPixelSize(R.dimen.doodle_shape_picker_custom_grid_padding);
            }
            Resources resources = context.getResources();
            if (i == 1) {
                return resources.getDimensionPixelSize(R.dimen.doodle_shape_picker_large_clock_grid_padding);
            }
            return resources.getDimensionPixelSize(R.dimen.doodle_shape_picker_grid_padding);
        }

        @Override // X.C2K1
        public String ADR() {
            StringBuilder A0P = C000200d.A0P("custom:");
            A0P.append(this.A00);
            return A0P.toString();
        }

        @Override // X.C2K1
        public boolean ARe() {
            int i = this.A00;
            return i == 7 || i == 8;
        }
    }};
    public static C3HS[] A02;
    public static C3HS[] A03;
    public static C3HS[] A04;
    public static C3HS[] A05;
    public static C3HS[] A06;
    public static C3HS[] A07;

    static {
        C3HS A002 = A00("e022");
        A002.A00(new int[]{10084});
        C3HS A003 = A00("e11c");
        A003.A00(new int[]{128128});
        C3HS A004 = A00("e04f");
        A004.A00(new int[]{128049});
        C3HS A005 = A00("e335");
        A005.A00(new int[]{127775});
        C3HS A006 = A00("e41c");
        A006.A00(new int[]{128068});
        C3HS A007 = A00("e05a");
        A007.A00(new int[]{128169});
        C3HS A008 = A00("e04e");
        A008.A00(new int[]{128124});
        C3HS A009 = A00("e003");
        A009.A00(new int[]{128139});
        C3HS A0010 = A00("e002");
        A0010.A00(new int[]{128103});
        C3HS A0011 = A00("e001");
        A0011.A00(new int[]{128102});
        C3HS A0012 = A00("e11b");
        A0012.A00(new int[]{128123});
        C3HS A0013 = A00("1f631");
        A0013.A00 = 2;
        A0013.A00(new int[]{128561});
        C3HS A0014 = A00("1f910");
        A0014.A00 = 2;
        A0014.A00(new int[]{129296});
        C3HS A0015 = A00("1f911");
        A0015.A00 = 2;
        A0015.A00(new int[]{129297});
        C3HS A0016 = A00("1f600");
        A0016.A00 = 2;
        A0016.A00(new int[]{128512});
        C3HS A0017 = A00("1f62c");
        A0017.A00 = 2;
        A0017.A00(new int[]{128556});
        C3HS A0018 = A00("1f60d");
        A0018.A00 = 2;
        A0018.A00(new int[]{128525});
        C3HS A0019 = A00("1f618");
        A0019.A00 = 2;
        A0019.A00(new int[]{128536});
        C3HS A0020 = A00("1f60f");
        A0020.A00 = 2;
        A0020.A00(new int[]{128527});
        C3HS A0021 = A00("1f636");
        A0021.A00 = 2;
        A0021.A00(new int[]{128566});
        C3HS A0022 = A00("1f644");
        A0022.A00 = 2;
        A0022.A00(new int[]{128580});
        C3HS A0023 = A00("1f624");
        A0023.A00 = 2;
        A0023.A00(new int[]{128548});
        C3HS A0024 = A00("1f621");
        A0024.A00(new int[]{128545});
        C3HS A0025 = A00("1f60a");
        A0025.A00 = 2;
        A0025.A00(new int[]{128522});
        C3HS A0026 = A00("1f60b");
        A0026.A00 = 2;
        A0026.A00(new int[]{128523});
        C3HS A0027 = A00("1f60c");
        A0027.A00 = 2;
        A0027.A00(new int[]{128524});
        C3HS A0028 = A00("1f60e");
        A0028.A00 = 2;
        A0028.A00(new int[]{128526});
        C3HS A0029 = A00("1f61a");
        A0029.A00 = 2;
        A0029.A00(new int[]{128538});
        C3HS A0030 = A00("1f61b");
        A0030.A00 = 2;
        A0030.A00(new int[]{128539});
        C3HS A0031 = A00("1f61c");
        A0031.A00 = 2;
        A0031.A00(new int[]{128540});
        C3HS A0032 = A00("1f61d");
        A0032.A00 = 2;
        A0032.A00(new int[]{128541});
        C3HS A0033 = A00("1f61e");
        A0033.A00 = 2;
        A0033.A00(new int[]{128542});
        C3HS A0034 = A00("1f61f");
        A0034.A00 = 2;
        A0034.A00(new int[]{128543});
        C3HS A0035 = A00("1f62a");
        A0035.A00 = 2;
        A0035.A00(new int[]{128554});
        C3HS A0036 = A00("1f62b");
        A0036.A00 = 2;
        A0036.A00(new int[]{128555});
        C3HS A0037 = A00("1f62d");
        A0037.A00 = 2;
        A0037.A00(new int[]{128557});
        C3HS A0038 = A00("1f62e");
        A0038.A00 = 2;
        A0038.A00(new int[]{128558});
        C3HS A0039 = A00("1f62f");
        A0039.A00 = 2;
        A0039.A00(new int[]{128559});
        C3HS A0040 = A00("1f44d");
        A0040.A00 = 3;
        A0040.A00(new int[]{128077});
        C3HS A0041 = A00("1f44c");
        A0041.A00 = 3;
        A0041.A00(new int[]{128076});
        C3HS A0042 = A00("1f44e");
        A0042.A00 = 3;
        A0042.A00(new int[]{128078});
        C3HS A0043 = A00("270c");
        A0043.A00 = 3;
        A0043.A00(new int[]{9996});
        C3HS A0044 = A00("1f595");
        A0044.A00 = 3;
        A0044.A00(new int[]{128405});
        C3HS A0045 = A00("1f590");
        A0045.A00 = 3;
        A0045.A00(new int[]{128400});
        C3HS A0046 = A00("1f918");
        A0046.A00 = 3;
        A0046.A00(new int[]{129304});
        C3HS A0047 = A00("1f596");
        A0047.A00 = 3;
        A0047.A00(new int[]{128406});
        C3HS A0048 = A00("261d");
        A0048.A00 = 3;
        A0048.A00(new int[]{9757});
        C3HS A0049 = A00("1f446");
        A0049.A00 = 3;
        A0049.A00(new int[]{128070});
        C3HS A0050 = A00("1f4a7");
        A0050.A00(new int[]{128167});
        C3HS A0051 = A00("1f4a4");
        A0051.A00(new int[]{128164});
        C3HS A0052 = A00("1f608");
        A0052.A00(new int[]{128520});
        C3HS A0053 = A00("1f47f");
        A0053.A00(new int[]{128127});
        C3HS A0054 = A00("1f47e");
        A0054.A00(new int[]{128126});
        C3HS A0055 = A00("1f479");
        A0055.A00(new int[]{128121});
        C3HS A0056 = A00("1f480");
        A0056.A00(new int[]{128128});
        C3HS A0057 = A00("2620");
        A0057.A00(new int[]{9760});
        C3HS A0058 = A00("1f47b");
        A0058.A00(new int[]{128123});
        C3HS A0059 = A00("1f47d");
        A0059.A00(new int[]{128125});
        C3HS A0060 = A00("1f916");
        A0060.A00(new int[]{129302});
        C3HS A0061 = A00("1f444");
        A0061.A00(new int[]{128068});
        C3HS A0062 = A00("1f445");
        A0062.A00(new int[]{128069});
        C3HS A0063 = A00("1f442");
        A0063.A03 = !A0063.A03;
        A0063.A00 = 3;
        A0063.A00(new int[]{128066});
        C3HS A0064 = A00("1f442");
        A0064.A00 = 3;
        A0064.A00(new int[]{128066});
        C3HS A0065 = A00("1f443");
        A0065.A00 = 3;
        A0065.A00(new int[]{128067});
        C3HS A0066 = A00("1f441");
        A0066.A00(new int[]{128065});
        C3HS A0067 = A00("1f440");
        A0067.A00(new int[]{128064});
        C3HS A0068 = A00("1f48b");
        A0068.A00(new int[]{128139});
        C3HS A0069 = A00("1f455");
        A0069.A00(new int[]{128085});
        C3HS A0070 = A00("1f456");
        A0070.A00(new int[]{128086});
        C3HS A0071 = A00("1f457");
        A0071.A00(new int[]{128087});
        C3HS A0072 = A00("1f459");
        A0072.A00(new int[]{128089});
        C3HS A0073 = A00("1f45a");
        A0073.A00(new int[]{128090});
        C3HS A0074 = A00("1f452");
        A0074.A00(new int[]{128082});
        C3HS A0075 = A00("1f3a9");
        A0075.A00(new int[]{127913});
        C3HS A0076 = A00("1f393");
        A0076.A00(new int[]{127891});
        C3HS A0077 = A00("1f451");
        A0077.A00(new int[]{128081});
        C3HS A0078 = A00("26d1");
        A0078.A00(new int[]{9937});
        C3HS A0079 = A00("1f453");
        A0079.A00(new int[]{128083});
        C3HS A0080 = A00("1f576");
        A0080.A00(new int[]{128374});
        C3HS A0081 = A00("1f302");
        A0081.A00(new int[]{127746});
        A06 = new C3HS[]{A002, A003, A004, A005, A006, A007, A008, A009, A0010, A0011, A0012, A0013, A0014, A0015, A0016, A0017, A0018, A0019, A0020, A0021, A0022, A0023, A0024, A0025, A0026, A0027, A0028, A0029, A0030, A0031, A0032, A0033, A0034, A0035, A0036, A0037, A0038, A0039, A0040, A0041, A0042, A0043, A0044, A0045, A0046, A0047, A0048, A0049, A0050, A0051, A0052, A0053, A0054, A0055, A0056, A0057, A0058, A0059, A0060, A0061, A0062, A0063, A0064, A0065, A0066, A0067, A0068, A0069, A0070, A0071, A0072, A0073, A0074, A0075, A0076, A0077, A0078, A0079, A0080, A0081};
        C3HS A0082 = A00("1f43a");
        A0082.A00(new int[]{128058});
        C3HS A0083 = A00("1f436");
        A0083.A00(new int[]{128054});
        C3HS A0084 = A00("1f431");
        A0084.A00(new int[]{128049});
        C3HS A0085 = A00("1f42d");
        A0085.A00(new int[]{128045});
        C3HS A0086 = A00("1f439");
        A0086.A00(new int[]{128057});
        C3HS A0087 = A00("1f430");
        A0087.A00(new int[]{128048});
        C3HS A0088 = A00("1f43b");
        A0088.A00(new int[]{128059});
        C3HS A0089 = A00("1f43c");
        A0089.A00(new int[]{128060});
        C3HS A0090 = A00("1f428");
        A0090.A00(new int[]{128040});
        C3HS A0091 = A00("1f42f");
        A0091.A00(new int[]{128047});
        C3HS A0092 = A00("1f981");
        A0092.A00(new int[]{129409});
        C3HS A0093 = A00("1f98b");
        A0093.A00(new int[]{129419});
        C3HS A0094 = A00("1f98c");
        A0094.A00(new int[]{129420});
        C3HS A0095 = A00("1f42e");
        A0095.A00(new int[]{128046});
        C3HS A0096 = A00("1f437");
        A0096.A00(new int[]{128055});
        C3HS A0097 = A00("1f43d");
        A0097.A00(new int[]{128061});
        C3HS A0098 = A00("1f438");
        A0098.A00(new int[]{128056});
        C3HS A0099 = A00("1f419");
        A0099.A00(new int[]{128025});
        C3HS A00100 = A00("1f435");
        A00100.A00(new int[]{128053});
        C3HS A00101 = A00("1f648");
        A00101.A00(new int[]{128584});
        C3HS A00102 = A00("1f649");
        A00102.A00(new int[]{128585});
        C3HS A00103 = A00("1f64a");
        A00103.A00(new int[]{128586});
        C3HS A00104 = A00("1f423");
        A00104.A00(new int[]{128035});
        C3HS A00105 = A00("1f425");
        A00105.A00(new int[]{128037});
        C3HS A00106 = A00("1f989");
        A00106.A00(new int[]{129417});
        C3HS A00107 = A00("1f41d");
        A00107.A00(new int[]{128029});
        C3HS A00108 = A00("1f41b");
        A00108.A00(new int[]{128027});
        C3HS A00109 = A00("1f40c");
        A00109.A00(new int[]{128012});
        C3HS A00110 = A00("1f41e");
        A00110.A00(new int[]{128030});
        C3HS A00111 = A00("1f41c");
        A00111.A00(new int[]{128028});
        C3HS A00112 = A00("1f577");
        A00112.A00(new int[]{128375});
        C3HS A00113 = A00("1f982");
        A00113.A00(new int[]{129410});
        C3HS A00114 = A00("1f980");
        A00114.A00(new int[]{129408});
        C3HS A00115 = A00("1f987");
        A00115.A00(new int[]{129415});
        C3HS A00116 = A00("1f40d");
        A00116.A00(new int[]{128013});
        C3HS A00117 = A00("1f422");
        A00117.A00(new int[]{128034});
        C3HS A00118 = A00("1f420");
        A00118.A00(new int[]{128032});
        C3HS A00119 = A00("1f41f");
        A00119.A00(new int[]{128031});
        C3HS A00120 = A00("1f421");
        A00120.A00(new int[]{128033});
        C3HS A00121 = A00("1f42c");
        A00121.A00(new int[]{128044});
        C3HS A00122 = A00("1f433");
        A00122.A00(new int[]{128051});
        C3HS A00123 = A00("1f40b");
        A00123.A00(new int[]{128011});
        C3HS A00124 = A00("1f40a");
        A00124.A00(new int[]{128010});
        C3HS A00125 = A00("1f43e");
        A00125.A00(new int[]{128062});
        C3HS A00126 = A00("1f335");
        A00126.A00(new int[]{127797});
        C3HS A00127 = A00("1f384");
        A00127.A00(new int[]{127876});
        C3HS A00128 = A00("1f332");
        A00128.A00(new int[]{127794});
        C3HS A00129 = A00("1f333");
        A00129.A00(new int[]{127795});
        C3HS A00130 = A00("1f334");
        A00130.A00(new int[]{127796});
        C3HS A00131 = A00("1f331");
        A00131.A00(new int[]{127793});
        C3HS A00132 = A00("1f33f");
        A00132.A00(new int[]{127807});
        C3HS A00133 = A00("2618");
        A00133.A00(new int[]{9752});
        C3HS A00134 = A00("1f340");
        A00134.A00(new int[]{127808});
        C3HS A00135 = A00("1f343");
        A00135.A00(new int[]{127811});
        C3HS A00136 = A00("1f342");
        A00136.A00(new int[]{127810});
        C3HS A00137 = A00("1f341");
        A00137.A00(new int[]{127809});
        C3HS A00138 = A00("1f33e");
        A00138.A00(new int[]{127806});
        C3HS A00139 = A00("1f33a");
        A00139.A00(new int[]{127802});
        C3HS A00140 = A00("1f33b");
        A00140.A00(new int[]{127803});
        C3HS A00141 = A00("1f339");
        A00141.A00(new int[]{127801});
        C3HS A00142 = A00("1f337");
        A00142.A00(new int[]{127799});
        C3HS A00143 = A00("1f33c");
        A00143.A00(new int[]{127804});
        C3HS A00144 = A00("1f338");
        A00144.A00(new int[]{127800});
        C3HS A00145 = A00("1f490");
        A00145.A00(new int[]{128144});
        C3HS A00146 = A00("1f344");
        A00146.A00(new int[]{127812});
        C3HS A00147 = A00("1f578");
        A00147.A00(new int[]{128376});
        C3HS A00148 = A00("1f383");
        A00148.A00(new int[]{127875});
        C3HS A00149 = A00("1f31e");
        A00149.A00(new int[]{127774});
        C3HS A00150 = A00("1f31d");
        A00150.A00(new int[]{127773});
        C3HS A00151 = A00("1f31c");
        A00151.A00(new int[]{127772});
        C3HS A00152 = A00("2b50");
        A00152.A00(new int[]{11088});
        C3HS A00153 = A00("1f31f");
        A00153.A00(new int[]{127775});
        C3HS A00154 = A00("1f4ab");
        A00154.A00(new int[]{128171});
        C3HS A00155 = A00("2728");
        A00155.A00(new int[]{10024});
        C3HS A00156 = A00("2600");
        A00156.A00(new int[]{9728});
        C3HS A00157 = A00("2602");
        A00157.A00(new int[]{9730});
        C3HS A00158 = A00("1f4a5");
        A00158.A00(new int[]{128165});
        C3HS A00159 = A00("1f525");
        A00159.A00(new int[]{128293});
        C3HS A00160 = A00("1f4a8");
        A00160.A00(new int[]{128168});
        C3HS A00161 = A00("1f324");
        A00161.A00(new int[]{127780});
        C3HS A00162 = A00("26c5");
        A00162.A00(new int[]{9925});
        C3HS A00163 = A00("1f325");
        A00163.A00(new int[]{127781});
        C3HS A00164 = A00("1f326");
        A00164.A00(new int[]{127782});
        C3HS A00165 = A00("2601");
        A00165.A00(new int[]{9729});
        C3HS A00166 = A00("1f327");
        A00166.A00(new int[]{127783});
        C3HS A00167 = A00("26c8");
        A00167.A00(new int[]{9928});
        C3HS A00168 = A00("1f329");
        A00168.A00(new int[]{127785});
        C3HS A00169 = A00("26a1");
        A00169.A00(new int[]{9889});
        C3HS A00170 = A00("2614");
        A00170.A00(new int[]{9748});
        C3HS A00171 = A00("1f4a6");
        A00171.A00(new int[]{128166});
        C3HS A00172 = A00("26c4");
        A00172.A00(new int[]{9924});
        C3HS A00173 = A00("2603");
        A00173.A00(new int[]{9731});
        C3HS A00174 = A00("2744");
        A00174.A00(new int[]{10052});
        A04 = new C3HS[]{A0082, A0083, A0084, A0085, A0086, A0087, A0088, A0089, A0090, A0091, A0092, A0093, A0094, A0095, A0096, A0097, A0098, A0099, A00100, A00101, A00102, A00103, A00104, A00105, A00106, A00107, A00108, A00109, A00110, A00111, A00112, A00113, A00114, A00115, A00116, A00117, A00118, A00119, A00120, A00121, A00122, A00123, A00124, A00125, A00126, A00127, A00128, A00129, A00130, A00131, A00132, A00133, A00134, A00135, A00136, A00137, A00138, A00139, A00140, A00141, A00142, A00143, A00144, A00145, A00146, A00147, A00148, A00149, A00150, A00151, A00152, A00153, A00154, A00155, A00156, A00157, A00158, A00159, A00160, A00161, A00162, A00163, A00164, A00165, A00166, A00167, A00168, A00169, A00170, A00171, A00172, A00173, A00174};
        C3HS A00175 = A00("1f37c");
        A00175.A00(new int[]{127868});
        C3HS A00176 = A00("1f37a");
        A00176.A00(new int[]{127866});
        C3HS A00177 = A00("1f37f");
        A00177.A00(new int[]{127871});
        C3HS A00178 = A00("1f37e");
        A00178.A00(new int[]{127870});
        C3HS A00179 = A00("1f379");
        A00179.A00(new int[]{127865});
        C3HS A00180 = A00("1f378");
        A00180.A00(new int[]{127864});
        C3HS A00181 = A00("1f377");
        A00181.A00(new int[]{127863});
        C3HS A00182 = A00("1f95b");
        A00182.A00(new int[]{129371});
        C3HS A00183 = A00("1f368");
        A00183.A00(new int[]{127848});
        C3HS A00184 = A00("1f36d");
        A00184.A00(new int[]{127853});
        C3HS A00185 = A00("1f36c");
        A00185.A00(new int[]{127852});
        C3HS A00186 = A00("1f366");
        A00186.A00(new int[]{127846});
        C3HS A00187 = A00("1f370");
        A00187.A00(new int[]{127856});
        C3HS A00188 = A00("1f382");
        A00188.A00(new int[]{127874});
        C3HS A00189 = A00("1f9c0");
        A00189.A00(new int[]{129472});
        C3HS A00190 = A00("1f355");
        A00190.A00(new int[]{127829});
        C3HS A00191 = A00("1f372");
        A00191.A00(new int[]{127858});
        C3HS A00192 = A00("1f357");
        A00192.A00(new int[]{127831});
        C3HS A00193 = A00("1f356");
        A00193.A00(new int[]{127830});
        C3HS A00194 = A00("1f353");
        A00194.A00(new int[]{127827});
        C3HS A00195 = A00("1f352");
        A00195.A00(new int[]{127826});
        C3HS A00196 = A00("1f34d");
        A00196.A00(new int[]{127821});
        C3HS A00197 = A00("1f34c");
        A00197.A00(new int[]{127820});
        C3HS A00198 = A00("1f345");
        A00198.A00(new int[]{127813});
        C3HS A00199 = A00("1f955");
        A00199.A00(new int[]{129365});
        C3HS A00200 = A00("1f336");
        A00200.A00(new int[]{127798});
        C3HS A00201 = A00("1f952");
        A00201.A00(new int[]{129362});
        C3HS A00202 = A00("1f950");
        A00202.A00(new int[]{129360});
        C3HS A00203 = A00("1f956");
        A00203.A00(new int[]{129366});
        A03 = new C3HS[]{A00175, A00176, A00177, A00178, A00179, A00180, A00181, A00182, A00183, A00184, A00185, A00186, A00187, A00188, A00189, A00190, A00191, A00192, A00193, A00194, A00195, A00196, A00197, A00198, A00199, A00200, A00201, A00202, A00203};
        C3HS A00204 = A00("26bd");
        A00204.A00(new int[]{9917});
        C3HS A00205 = A00("1f3c0");
        A00205.A00(new int[]{127936});
        C3HS A00206 = A00("1f3c8");
        A00206.A00(new int[]{127944});
        C3HS A00207 = A00("26be");
        A00207.A00(new int[]{9918});
        C3HS A00208 = A00("1f3d0");
        A00208.A00(new int[]{127952});
        C3HS A00209 = A00("1f3c9");
        A00209.A00(new int[]{127945});
        C3HS A00210 = A00("1f3c5");
        A00210.A00(new int[]{127941});
        C3HS A00211 = A00("1f396");
        A00211.A00(new int[]{127894});
        C3HS A00212 = A00("1f397");
        A00212.A00(new int[]{127895});
        C3HS A00213 = A00("1f3c6");
        A00213.A00(new int[]{127942});
        C3HS A00214 = A00("1f3bd");
        A00214.A00(new int[]{127933});
        A02 = new C3HS[]{A00204, A00205, A00206, A00207, A00208, A00209, A00210, A00211, A00212, A00213, A00214};
        C3HS A00215 = A00("1f3b6");
        A00215.A00(new int[]{127926});
        C3HS A00216 = A00("2764");
        A00216.A00(new int[]{10084});
        C3HS A00217 = A00("1f49b");
        A00217.A00(new int[]{128155});
        C3HS A00218 = A00("1f49a");
        A00218.A00(new int[]{128154});
        C3HS A00219 = A00("1f499");
        A00219.A00(new int[]{128153});
        C3HS A00220 = A00("1f49c");
        A00220.A00(new int[]{128156});
        C3HS A00221 = A00("1f494");
        A00221.A00(new int[]{128148});
        C3HS A00222 = A00("2763");
        A00222.A00(new int[]{10083});
        C3HS A00223 = A00("1f495");
        A00223.A00(new int[]{128149});
        C3HS A00224 = A00("1f49e");
        A00224.A00(new int[]{128158});
        C3HS A00225 = A00("1f493");
        A00225.A00(new int[]{128147});
        C3HS A00226 = A00("1f497");
        A00226.A00(new int[]{128151});
        C3HS A00227 = A00("1f496");
        A00227.A00(new int[]{128150});
        C3HS A00228 = A00("1f498");
        A00228.A00(new int[]{128152});
        C3HS A00229 = A00("1f49d");
        A00229.A00(new int[]{128157});
        C3HS A00230 = A00("1f512");
        A00230.A00(new int[]{128274});
        C3HS A00231 = A00("1f51e");
        A00231.A00(new int[]{128286});
        C3HS A00232 = A00("1f4f5");
        A00232.A00(new int[]{128245});
        C3HS A00233 = A00("2757");
        A00233.A00(new int[]{10071});
        C3HS A00234 = A00("2753");
        A00234.A00(new int[]{10067});
        C3HS A00235 = A00("2660");
        A00235.A00(new int[]{9824});
        C3HS A00236 = A00("2663");
        A00236.A00(new int[]{9827});
        C3HS A00237 = A00("2665");
        A00237.A00(new int[]{9829});
        C3HS A00238 = A00("2666");
        A00238.A00(new int[]{9830});
        C3HS A00239 = A00("1f5ef");
        A00239.A00(new int[]{128495});
        A07 = new C3HS[]{A00215, A00216, A00217, A00218, A00219, A00220, A00221, A00222, A00223, A00224, A00225, A00226, A00227, A00228, A00229, A00230, A00231, A00232, A00233, A00234, A00235, A00236, A00237, A00238, A00239};
        C3HS A00240 = A00("1f6bf");
        A00240.A00(new int[]{128703});
        C3HS A00241 = A00("23f0");
        A00241.A00(new int[]{9200});
        C3HS A00242 = A00("1f3f7");
        A00242.A00(new int[]{127991});
        C3HS A00243 = A00("1f3fa");
        A00243.A00(new int[]{127994});
        C3HS A00244 = A00("1f489");
        A00244.A00(new int[]{128137});
        C3HS A00245 = A00("1f38a");
        A00245.A00(new int[]{127882});
        C3HS A00246 = A00("1f6ac");
        A00246.A00(new int[]{128684});
        C3HS A00247 = A00("1f4a1");
        A00247.A00(new int[]{128161});
        C3HS A00248 = A00("1f56f");
        A00248.A00(new int[]{128367});
        C3HS A00249 = A00("1f399");
        A00249.A00(new int[]{127897});
        C3HS A00250 = A00("1f381");
        A00250.A00(new int[]{127873});
        C3HS A00251 = A00("1f389");
        A00251.A00(new int[]{127881});
        C3HS A00252 = A00("2708");
        A00252.A00(new int[]{9992});
        C3HS A00253 = A00("1f680");
        A00253.A00(new int[]{128640});
        C3HS A00254 = A00("1f3c1");
        A00254.A00(new int[]{127937});
        C3HS A00255 = A00("2693");
        A00255.A00(new int[]{9875});
        C3HS A00256 = A00("1f3e0");
        A00256.A00(new int[]{127968});
        C3HS A00257 = A00("1f4b0");
        A00257.A00(new int[]{128176});
        C3HS A00258 = A00("1f380");
        A00258.A00(new int[]{127872});
        C3HS A00259 = A00("1f388");
        A00259.A00(new int[]{127880});
        A05 = new C3HS[]{A00240, A00241, A00242, A00243, A00244, A00245, A00246, A00247, A00248, A00249, A00250, A00251, A00252, A00253, A00254, A00255, A00256, A00257, A00258, A00259};
    }

    public static C3HS A00(String str) {
        return new C3HS(C000200d.A0H(str, ".svg"));
    }

    public static List A01(boolean z) {
        ArrayList arrayList = new ArrayList();
        for (C30N c30n : z ? new C30N[]{C30N.CONTENT_STICKERS, C30N.SHAPES} : C30N.values()) {
            arrayList.addAll(Arrays.asList(c30n.shapeData));
        }
        return arrayList;
    }
}
