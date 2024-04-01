package com.whatsapp.search;

import X.AbstractC04890Mh;
import X.AbstractC14890nk;
import X.C0Y0;
import X.C15230oI;
import android.content.Context;
import androidx.recyclerview.widget.GridLayoutManager;
import com.whatsapp.migration.android.view.GoogleMigrateImporterActivity;
import com.whatsapp.search.SearchGridLayoutManager;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.GlVideoRenderer;

/* loaded from: classes2.dex */
public class SearchGridLayoutManager extends GridLayoutManager {
    public final AbstractC04890Mh A00;

    public SearchGridLayoutManager(final Context context, AbstractC04890Mh abstractC04890Mh) {
        super(6);
        this.A00 = abstractC04890Mh;
        ((GridLayoutManager) this).A01 = new AbstractC14890nk() { // from class: X.3ni
            @Override // X.AbstractC14890nk
            public int A00(int i) {
                SearchGridLayoutManager searchGridLayoutManager = SearchGridLayoutManager.this;
                int i2 = context.getResources().getConfiguration().orientation;
                int A0D = searchGridLayoutManager.A00.A0D(i);
                if (A0D != -1 && A0D != 99 && A0D != 1 && A0D != 2 && A0D != 3 && A0D != 4) {
                    switch (A0D) {
                        case 6:
                        case 7:
                        case GoogleMigrateImporterActivity.A0E /* 11 */:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                        case GlVideoRenderer.CAP_RENDER_I420 /* 16 */:
                        case 17:
                        case 18:
                        case 19:
                        case C0M6.A01 /* 20 */:
                        case 21:
                            break;
                        case 8:
                            return i2 == 1 ? 3 : 2;
                        case 9:
                        case 10:
                            return i2 == 1 ? 2 : 1;
                        default:
                            throw new UnsupportedOperationException(C000200d.A0D("Invalid viewType: ", A0D));
                    }
                }
                return 6;
            }
        };
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, X.C0SV
    public void A0z(C15230oI c15230oI, C0Y0 c0y0) {
        try {
            super.A0z(c15230oI, c0y0);
        } catch (IndexOutOfBoundsException e) {
            Log.e(e);
        }
    }
}
