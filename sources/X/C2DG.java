package X;

import android.content.ClipData;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Pair;
import androidx.core.content.FileProvider;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.2DG */
/* loaded from: classes2.dex */
public class C2DG implements C2DH {
    public C2DJ[] A00;
    public final C001200o A01;
    public final C2DF A02;

    public C2DG(C001200o c001200o, C2DF c2df) {
        this.A01 = c001200o;
        this.A02 = c2df;
        this.A00 = new C2DJ[]{new C2DJ(c001200o) { // from class: X.2DK
            public final C001200o A00;

            {
                this.A00 = c001200o;
            }

            @Override // X.C2DJ
            public Intent AD7(int i, List list) {
                String str;
                if (i != 5 && i != 4) {
                    if (i == 1) {
                        str = "image/png";
                    } else {
                        str = (i == 2 || i == 4) ? "video/mp4" : "*/*";
                    }
                    String str2 = (i == 5 || i == 3 || i == 1) ? "com.facebook.lite.composer.activities.ShareIntentMultiPhotoAlphabeticalAlias" : "com.facebook.lite.composer.activities.ShareIntentVideoAlphabeticalAlias";
                    ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                    JSONArray jSONArray = new JSONArray();
                    for (int i2 = 0; i2 < list.size(); i2++) {
                        JSONObject jSONObject = new JSONObject();
                        C2DP c2dp = (C2DP) list.get(i2);
                        Uri uri = c2dp.A02;
                        try {
                            jSONObject.put("story_media_caption", c2dp.A03);
                            jSONObject.put("story_media_uri", uri.toString());
                            jSONObject.put("story_media_video_length_sec", c2dp.A01);
                            jSONObject.put("story_media_aspect_ratio", c2dp.A00);
                            jSONObject.put("story_media_link_url", c2dp.A04);
                            jSONArray.put(jSONObject.toString());
                            arrayList.add(uri);
                        } catch (JSONException e) {
                            Log.w("liteposter/json", e);
                        }
                    }
                    Intent putExtra = new Intent().setType(str).setPackage("com.facebook.lite").setComponent(new ComponentName("com.facebook.lite", str2)).addFlags(268435456).putExtra("com.facebook.platform.extra.APPLICATION_ID", "994766073959253").putExtra("editing_disabled", true).putExtra("media_list", jSONArray.toString());
                    if (list.size() != 1) {
                        if (list.size() > 1) {
                            putExtra.setAction("android.intent.action.SEND_MULTIPLE").putParcelableArrayListExtra("android.intent.extra.STREAM", arrayList);
                        }
                    } else {
                        putExtra.setAction("android.intent.action.SEND").putExtra("android.intent.extra.STREAM", ((C2DP) list.get(0)).A02);
                    }
                    List<ResolveInfo> queryIntentActivities = this.A00.A00.getPackageManager().queryIntentActivities(putExtra, 65536);
                    if (queryIntentActivities == null || queryIntentActivities.size() == 0) {
                        return null;
                    }
                    return putExtra;
                }
                return null;
            }

            @Override // X.C2DJ
            public boolean AFx() {
                Intent intent = new Intent();
                intent.setPackage("com.facebook.lite").setType("image/png").setComponent(new ComponentName("com.facebook.lite", "com.facebook.lite.composer.activities.ShareIntentMultiPhotoAlphabeticalAlias"));
                C001200o c001200o2 = this.A00;
                try {
                    List<ResolveInfo> queryIntentActivities = c001200o2.A00.getPackageManager().queryIntentActivities(intent, 65536);
                    if (queryIntentActivities == null || queryIntentActivities.size() <= 0) {
                        return false;
                    }
                    try {
                        return Integer.parseInt(c001200o2.A00.getPackageManager().getPackageInfo("com.facebook.lite", 0).versionName.split("\\.")[0]) >= 91;
                    } catch (Exception e) {
                        Log.w("Cannot get FBLite version number", e);
                        return false;
                    }
                } catch (Exception unused) {
                    return false;
                }
            }
        }, new C2DJ(c001200o) { // from class: X.2DL
            public final C001200o A00;

            {
                this.A00 = c001200o;
            }

            @Override // X.C2DJ
            public Intent AD7(int i, List list) {
                String str = (i == 1 || i == 3) ? "image/png" : "video/mp4";
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                for (int i2 = 0; i2 < list.size(); i2++) {
                    C2DP c2dp = (C2DP) list.get(i2);
                    Bundle bundle = new Bundle();
                    bundle.putString("story_media_caption", c2dp.A03);
                    bundle.putParcelable("story_media_uri", c2dp.A02);
                    bundle.putInt("story_media_video_length_sec", c2dp.A01);
                    bundle.putDouble("story_media_aspect_ratio", c2dp.A00);
                    String str2 = c2dp.A04;
                    if (str2 != null) {
                        bundle.putString("story_media_link_url", str2);
                    }
                    arrayList.add(bundle);
                }
                Intent putParcelableArrayListExtra = new Intent().setAction("com.facebook.stories.ADD_TO_STORY").setPackage("com.facebook.katana").putExtra("com.facebook.platform.extra.APPLICATION_ID", "994766073959253").putExtra("editing_disabled", true).setType(str).putParcelableArrayListExtra("media_list", arrayList);
                List<ResolveInfo> queryIntentActivities = this.A00.A00.getPackageManager().queryIntentActivities(putParcelableArrayListExtra, 65536);
                if (queryIntentActivities == null || queryIntentActivities.size() == 0) {
                    return null;
                }
                return putParcelableArrayListExtra;
            }

            @Override // X.C2DJ
            public boolean AFx() {
                Intent intent = new Intent("com.facebook.stories.ADD_TO_STORY");
                intent.setPackage("com.facebook.katana");
                intent.setType("image/png");
                C001200o c001200o2 = this.A00;
                try {
                    List<ResolveInfo> queryIntentActivities = c001200o2.A00.getPackageManager().queryIntentActivities(intent, 65536);
                    if (queryIntentActivities == null || queryIntentActivities.size() <= 0) {
                        return false;
                    }
                    try {
                        return Integer.parseInt(c001200o2.A00.getPackageManager().getPackageInfo("com.facebook.katana", 0).versionName.split("\\.")[0]) >= 227;
                    } catch (Exception e) {
                        Log.w("Cannot get FB version number", e);
                        return false;
                    }
                } catch (Exception unused) {
                    return false;
                }
            }
        }};
    }

    @Override // X.C2DH
    public C2DM AD8(List list, Context context) {
        String str;
        Object obj;
        C000700j.A00();
        if (list.isEmpty()) {
            return null;
        }
        C2DM c2dm = new C2DM();
        int i = 0;
        while (true) {
            C2DJ[] c2djArr = this.A00;
            if (i < c2djArr.length) {
                C2DJ c2dj = c2djArr[i];
                if (c2dj.AFx()) {
                    ArrayList arrayList = new ArrayList();
                    C2DN A00 = C2DN.A00(this.A02, context, list);
                    int i2 = A00.A00;
                    if (i2 == 0) {
                        return c2dm;
                    }
                    Map map = A00.A01;
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = map.entrySet().iterator();
                    while (true) {
                        int i3 = 0;
                        if (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            AnonymousClass092 anonymousClass092 = (AnonymousClass092) entry.getKey();
                            C2DO c2do = (C2DO) entry.getValue();
                            File file = c2do.A00;
                            try {
                                Uri ADj = FileProvider.A00(this.A01.A00, "com.whatsapp.fileprovider").ADj(file);
                                Pair create = Pair.create(0, 0);
                                boolean z = anonymousClass092 instanceof AnonymousClass095;
                                str = "";
                                if (!z && !(anonymousClass092 instanceof C09F)) {
                                    if (anonymousClass092 instanceof C0JJ) {
                                        BitmapFactory.Options options = new BitmapFactory.Options();
                                        options.inJustDecodeBounds = true;
                                        BitmapFactory.decodeFile(file.getAbsolutePath(), options);
                                        create = new Pair(Integer.valueOf(options.outHeight), Integer.valueOf(options.outWidth));
                                    }
                                } else {
                                    String A1A = ((AnonymousClass097) anonymousClass092).A1A();
                                    str = A1A != null ? A1A : "";
                                    if (z) {
                                        BitmapFactory.Options options2 = new BitmapFactory.Options();
                                        options2.inJustDecodeBounds = true;
                                        BitmapFactory.decodeFile(file.getAbsolutePath(), options2);
                                        create = new Pair(Integer.valueOf(options2.outHeight), Integer.valueOf(options2.outWidth));
                                    } else {
                                        create = C0DD.A0C(file);
                                    }
                                }
                                if (ADj == null) {
                                    continue;
                                } else {
                                    Object obj2 = create.first;
                                    if (obj2 != null) {
                                        double intValue = ((Number) obj2).intValue();
                                        if (create.second != null) {
                                            double intValue2 = intValue == 0.0d ? 0.0d : ((Number) obj).intValue() / intValue;
                                            int A03 = C0DD.A03(file);
                                            String str2 = c2do.A01;
                                            arrayList2.add(ADj);
                                            arrayList.add(new C2DP(A03, intValue2, ADj, str, str2));
                                        } else {
                                            throw null;
                                        }
                                    } else {
                                        throw null;
                                    }
                                }
                            } catch (IllegalArgumentException unused) {
                                Log.w("getSharingIntent: Attempting to share file failed");
                            }
                        } else {
                            Intent AD7 = c2dj.AD7(i2, arrayList);
                            c2dm.A01 = AD7;
                            c2dm.A02 = arrayList2;
                            if (AD7 == null) {
                                if (c2dj instanceof C2DK) {
                                    if (i2 == 5) {
                                        i3 = 1;
                                    } else if (i2 == 4) {
                                        i3 = 2;
                                    }
                                }
                                c2dm.A00 = i3;
                                return c2dm;
                            }
                            if (arrayList2.size() > 0) {
                                ClipData newRawUri = ClipData.newRawUri(null, (Uri) arrayList2.get(0));
                                for (int i4 = 1; i4 < arrayList2.size(); i4++) {
                                    newRawUri.addItem(new ClipData.Item((Uri) arrayList2.get(i4)));
                                }
                                if (newRawUri != null) {
                                    AD7.setClipData(newRawUri);
                                }
                            }
                            AD7.addFlags(1);
                            return c2dm;
                        }
                    }
                } else {
                    i++;
                }
            } else {
                return c2dm;
            }
        }
    }
}
