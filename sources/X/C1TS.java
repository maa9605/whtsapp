package X;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;

/* renamed from: X.1TS */
/* loaded from: classes.dex */
public abstract class C1TS extends BaseAdapter implements InterfaceC13360l8, Filterable {
    public int A00;
    public Context A01;
    public Cursor A02;
    public DataSetObserver A03;
    public C13340l6 A04;
    public C13370l9 A05;
    public boolean A06;
    public boolean A07;

    public abstract View A03(Context context, Cursor cursor, ViewGroup viewGroup);

    public abstract void A04(View view, Context context, Cursor cursor);

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return true;
    }

    public C1TS(Context context) {
        A02(context);
    }

    public C1TS(Context context, Cursor cursor, boolean z) {
        A02(context);
    }

    public Cursor A00(Cursor cursor) {
        Cursor cursor2 = this.A02;
        if (cursor == cursor2) {
            return null;
        }
        if (cursor2 != null) {
            C13340l6 c13340l6 = this.A04;
            if (c13340l6 != null) {
                cursor2.unregisterContentObserver(c13340l6);
            }
            DataSetObserver dataSetObserver = this.A03;
            if (dataSetObserver != null) {
                cursor2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.A02 = cursor;
        if (cursor != null) {
            C13340l6 c13340l62 = this.A04;
            if (c13340l62 != null) {
                cursor.registerContentObserver(c13340l62);
            }
            DataSetObserver dataSetObserver2 = this.A03;
            if (dataSetObserver2 != null) {
                cursor.registerDataSetObserver(dataSetObserver2);
            }
            this.A00 = cursor.getColumnIndexOrThrow("_id");
            this.A07 = true;
            notifyDataSetChanged();
            return cursor2;
        }
        this.A00 = -1;
        this.A07 = false;
        notifyDataSetInvalidated();
        return cursor2;
    }

    public View A01(Context context, Cursor cursor, ViewGroup viewGroup) {
        return A03(context, cursor, viewGroup);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.0l6] */
    public void A02(Context context) {
        this.A06 = true;
        this.A02 = null;
        this.A07 = false;
        this.A01 = context;
        this.A00 = -1;
        this.A04 = new ContentObserver() { // from class: X.0l6
            @Override // android.database.ContentObserver
            public boolean deliverSelfNotifications() {
                return true;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(new Handler());
                C1TS.this = this;
            }

            @Override // android.database.ContentObserver
            public void onChange(boolean z) {
                Cursor cursor;
                C1TS c1ts = C1TS.this;
                if (!c1ts.A06 || (cursor = c1ts.A02) == null || cursor.isClosed()) {
                    return;
                }
                c1ts.A07 = c1ts.A02.requery();
            }
        };
        this.A03 = new DataSetObserver() { // from class: X.0l7
            {
                C1TS.this = this;
            }

            @Override // android.database.DataSetObserver
            public void onChanged() {
                C1TS c1ts = C1TS.this;
                c1ts.A07 = true;
                c1ts.notifyDataSetChanged();
            }

            @Override // android.database.DataSetObserver
            public void onInvalidated() {
                C1TS c1ts = C1TS.this;
                c1ts.A07 = false;
                c1ts.notifyDataSetInvalidated();
            }
        };
    }

    public void A62(Cursor cursor) {
        Cursor A00 = A00(cursor);
        if (A00 != null) {
            A00.close();
        }
    }

    public CharSequence A6Z(Cursor cursor) {
        return cursor == null ? "" : cursor.toString();
    }

    public Cursor AS6(CharSequence charSequence) {
        return this.A02;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        Cursor cursor;
        if (!this.A07 || (cursor = this.A02) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (this.A07) {
            this.A02.moveToPosition(i);
            if (view == null) {
                view = A01(this.A01, this.A02, viewGroup);
            }
            A04(view, this.A01, this.A02);
            return view;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.widget.Filter, X.0l9] */
    @Override // android.widget.Filterable
    public Filter getFilter() {
        C13370l9 c13370l9 = this.A05;
        if (c13370l9 == null) {
            ?? r0 = new Filter(this) { // from class: X.0l9
                public InterfaceC13360l8 A00;

                {
                    this.A00 = this;
                }

                @Override // android.widget.Filter
                public CharSequence convertResultToString(Object obj) {
                    return this.A00.A6Z((Cursor) obj);
                }

                @Override // android.widget.Filter
                public Filter.FilterResults performFiltering(CharSequence charSequence) {
                    Cursor AS6 = this.A00.AS6(charSequence);
                    Filter.FilterResults filterResults = new Filter.FilterResults();
                    if (AS6 != null) {
                        filterResults.count = AS6.getCount();
                        filterResults.values = AS6;
                        return filterResults;
                    }
                    filterResults.count = 0;
                    filterResults.values = null;
                    return filterResults;
                }

                @Override // android.widget.Filter
                public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
                    InterfaceC13360l8 interfaceC13360l8 = this.A00;
                    Cursor cursor = ((C1TS) interfaceC13360l8).A02;
                    Object obj = filterResults.values;
                    if (obj == null || obj == cursor) {
                        return;
                    }
                    interfaceC13360l8.A62((Cursor) obj);
                }
            };
            this.A05 = r0;
            return r0;
        }
        return c13370l9;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        Cursor cursor;
        if (!this.A07 || (cursor = this.A02) == null) {
            return null;
        }
        cursor.moveToPosition(i);
        return this.A02;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        Cursor cursor;
        if (this.A07 && (cursor = this.A02) != null && cursor.moveToPosition(i)) {
            return this.A02.getLong(this.A00);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (this.A07) {
            if (this.A02.moveToPosition(i)) {
                if (view == null) {
                    view = A03(this.A01, this.A02, viewGroup);
                }
                A04(view, this.A01, this.A02);
                return view;
            }
            throw new IllegalStateException(C000200d.A0D("couldn't move cursor to position ", i));
        }
        throw new IllegalStateException("this should only be called when the cursor is valid");
    }
}
