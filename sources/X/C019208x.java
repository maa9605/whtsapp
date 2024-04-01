package X;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;

/* renamed from: X.08x */
/* loaded from: classes.dex */
public class C019208x {
    public final int A00;
    public final C019308y A01;

    public C019208x(Context context) {
        this(context, DialogInterfaceC019408z.A00(context, 0));
    }

    public C019208x(Context context, int i) {
        this.A01 = new C019308y(new ContextThemeWrapper(context, DialogInterfaceC019408z.A00(context, i)));
        this.A00 = i;
    }

    public DialogInterfaceC019408z A00() {
        int i;
        ListAdapter listAdapter;
        final C019308y c019308y = this.A01;
        Context context = c019308y.A0O;
        DialogInterfaceC019408z dialogInterfaceC019408z = new DialogInterfaceC019408z(context, this.A00);
        final C10580gJ c10580gJ = dialogInterfaceC019408z.A00;
        View view = c019308y.A0B;
        if (view != null) {
            c10580gJ.A0E = view;
        } else {
            CharSequence charSequence = c019308y.A0I;
            if (charSequence != null) {
                c10580gJ.A0T = charSequence;
                TextView textView = c10580gJ.A0N;
                if (textView != null) {
                    textView.setText(charSequence);
                }
            }
            Drawable drawable = c019308y.A0A;
            if (drawable != null) {
                c10580gJ.A09 = drawable;
                c10580gJ.A03 = 0;
                ImageView imageView = c10580gJ.A0J;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    c10580gJ.A0J.setImageDrawable(drawable);
                }
            }
        }
        CharSequence charSequence2 = c019308y.A0E;
        if (charSequence2 != null) {
            c10580gJ.A0S = charSequence2;
            TextView textView2 = c10580gJ.A0M;
            if (textView2 != null) {
                textView2.setText(charSequence2);
            }
        }
        CharSequence charSequence3 = c019308y.A0H;
        if (charSequence3 != null) {
            c10580gJ.A04(-1, charSequence3, c019308y.A06);
        }
        CharSequence charSequence4 = c019308y.A0F;
        if (charSequence4 != null) {
            c10580gJ.A04(-2, charSequence4, c019308y.A03);
        }
        CharSequence charSequence5 = c019308y.A0G;
        if (charSequence5 != null) {
            c10580gJ.A04(-3, charSequence5, c019308y.A04);
        }
        if (c019308y.A0M != null || c019308y.A0D != null) {
            final AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) c019308y.A0P.inflate(c10580gJ.A05, (ViewGroup) null);
            if (c019308y.A0K) {
                listAdapter = new ArrayAdapter(context, c10580gJ.A06, c019308y.A0M) { // from class: X.0gD
                    @Override // android.widget.ArrayAdapter, android.widget.Adapter
                    public View getView(int i2, View view2, ViewGroup viewGroup) {
                        View view3 = super.getView(i2, view2, viewGroup);
                        boolean[] zArr = c019308y.A0N;
                        if (zArr != null && zArr[i2]) {
                            alertController$RecycleListView.setItemChecked(i2, true);
                        }
                        return view3;
                    }
                };
            } else {
                if (c019308y.A0L) {
                    i = c10580gJ.A07;
                } else {
                    i = c10580gJ.A04;
                }
                listAdapter = c019308y.A0D;
                if (listAdapter == null) {
                    listAdapter = new ArrayAdapter(context, i, c019308y.A0M) { // from class: X.0gH
                        @Override // android.widget.ArrayAdapter, android.widget.Adapter
                        public long getItemId(int i2) {
                            return i2;
                        }

                        @Override // android.widget.BaseAdapter, android.widget.Adapter
                        public boolean hasStableIds() {
                            return true;
                        }
                    };
                }
            }
            c10580gJ.A0K = listAdapter;
            c10580gJ.A02 = c019308y.A00;
            if (c019308y.A05 != null) {
                alertController$RecycleListView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: X.0gE
                    @Override // android.widget.AdapterView.OnItemClickListener
                    public void onItemClick(AdapterView adapterView, View view2, int i2, long j) {
                        C019308y c019308y2 = c019308y;
                        DialogInterface.OnClickListener onClickListener = c019308y2.A05;
                        AnonymousClass090 anonymousClass090 = c10580gJ.A0Z;
                        onClickListener.onClick(anonymousClass090, i2);
                        if (c019308y2.A0L) {
                            return;
                        }
                        anonymousClass090.dismiss();
                    }
                });
            } else if (c019308y.A09 != null) {
                alertController$RecycleListView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: X.0gF
                    @Override // android.widget.AdapterView.OnItemClickListener
                    public void onItemClick(AdapterView adapterView, View view2, int i2, long j) {
                        C019308y c019308y2 = c019308y;
                        boolean[] zArr = c019308y2.A0N;
                        if (zArr != null) {
                            zArr[i2] = alertController$RecycleListView.isItemChecked(i2);
                        }
                        c019308y2.A09.onClick(c10580gJ.A0Z, i2, alertController$RecycleListView.isItemChecked(i2));
                    }
                });
            }
            if (c019308y.A0L) {
                alertController$RecycleListView.setChoiceMode(1);
            } else if (c019308y.A0K) {
                alertController$RecycleListView.setChoiceMode(2);
            }
            c10580gJ.A0L = alertController$RecycleListView;
        }
        View view2 = c019308y.A0C;
        if (view2 != null) {
            c10580gJ.A0F = view2;
            c10580gJ.A08 = 0;
        } else {
            int i2 = c019308y.A01;
            if (i2 != 0) {
                c10580gJ.A0F = null;
                c10580gJ.A08 = i2;
            }
        }
        dialogInterfaceC019408z.setCancelable(c019308y.A0J);
        if (c019308y.A0J) {
            dialogInterfaceC019408z.setCanceledOnTouchOutside(true);
        }
        dialogInterfaceC019408z.setOnCancelListener(c019308y.A02);
        dialogInterfaceC019408z.setOnDismissListener(c019308y.A07);
        DialogInterface.OnKeyListener onKeyListener = c019308y.A08;
        if (onKeyListener != null) {
            dialogInterfaceC019408z.setOnKeyListener(onKeyListener);
        }
        return dialogInterfaceC019408z;
    }

    public DialogInterfaceC019408z A01() {
        DialogInterfaceC019408z A00 = A00();
        A00.show();
        return A00;
    }

    public void A02(int i) {
        C019308y c019308y = this.A01;
        c019308y.A0E = c019308y.A0O.getText(i);
    }

    public void A03(int i) {
        C019308y c019308y = this.A01;
        c019308y.A0I = c019308y.A0O.getText(i);
    }

    public void A04(int i, DialogInterface.OnClickListener onClickListener) {
        C019308y c019308y = this.A01;
        c019308y.A0F = c019308y.A0O.getText(i);
        c019308y.A03 = onClickListener;
    }

    public void A05(int i, DialogInterface.OnClickListener onClickListener) {
        C019308y c019308y = this.A01;
        c019308y.A0G = c019308y.A0O.getText(i);
        c019308y.A04 = onClickListener;
    }

    public void A06(int i, DialogInterface.OnClickListener onClickListener) {
        C019308y c019308y = this.A01;
        c019308y.A0H = c019308y.A0O.getText(i);
        c019308y.A06 = onClickListener;
    }

    public void A07(View view) {
        C019308y c019308y = this.A01;
        c019308y.A0C = view;
        c019308y.A01 = 0;
    }

    public void A08(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        C019308y c019308y = this.A01;
        c019308y.A0H = charSequence;
        c019308y.A06 = onClickListener;
    }
}
