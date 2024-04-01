package com.whatsapp;

import X.AnonymousClass029;
import X.AnonymousClass092;
import X.C000400f;
import X.C002701i;
import X.C003101m;
import X.C04100In;
import X.C0DB;
import X.C0DD;
import X.C2Gx;
import X.C42611w2;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import com.whatsapp.Mp4Ops;
import com.whatsapp.jid.Jid;
import com.whatsapp.mediacomposer.MediaComposerActivity;
import com.whatsapp.mentions.MentionableEntry;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class GifHelper {
    public static native Mp4Ops.LibMp4OperationResult applyGifTag(String str, String str2);

    public static native boolean hasGifTag(String str);

    public static Intent A00(File file, Activity activity, MentionableEntry mentionableEntry, List list, AnonymousClass092 anonymousClass092) {
        ArrayList A0E;
        String str;
        String str2;
        Uri fromFile = Uri.fromFile(new File(file.getAbsolutePath()));
        ArrayList arrayList = new ArrayList();
        arrayList.add(fromFile);
        String A0t = C002701i.A0t(mentionableEntry.getStringText());
        C42611w2 c42611w2 = new C42611w2(fromFile);
        c42611w2.A0B(A0t);
        c42611w2.A0C(AnonymousClass029.A0v(mentionableEntry.getMentions()));
        Bundle A00 = new C2Gx(c42611w2).A00();
        if (list.size() == 1) {
            str = C003101m.A07((Jid) list.get(0));
            A0E = null;
        } else {
            A0E = C003101m.A0E(list);
            str = null;
        }
        long j = 0;
        if (anonymousClass092 != null) {
            j = anonymousClass092.A0p;
            str2 = C003101m.A07(C0DB.A04(anonymousClass092));
        } else {
            str2 = null;
        }
        Intent intent = new Intent(activity, MediaComposerActivity.class);
        intent.putExtra("android.intent.extra.STREAM", arrayList);
        intent.putExtra("android.intent.extra.TEXT", (String) null);
        intent.putExtra("jid", str);
        intent.putExtra("jids", A0E);
        intent.putExtra("max_items", 0);
        intent.putExtra("origin", 9);
        intent.putExtra("picker_open_time", SystemClock.elapsedRealtime());
        intent.putExtra("send", true);
        intent.putExtra("quoted_message_row_id", j);
        intent.putExtra("quoted_group_jid", str2);
        intent.putExtra("number_from_url", false);
        intent.putExtra("media_preview_params", A00);
        intent.putExtra("smb_quick_reply", false);
        intent.putExtra("start_home", false);
        intent.putExtra("animate_uri", (Parcelable) null);
        intent.putExtra("preselected_image_uri", (Parcelable) null);
        intent.putExtra("scan_for_qr", false);
        return intent;
    }

    public static void A01(C000400f c000400f, File file) {
        try {
            File A07 = c000400f.A07(file);
            Mp4Ops.LibMp4OperationResult applyGifTag = applyGifTag(file.getAbsolutePath(), A07.getAbsolutePath());
            if (applyGifTag != null) {
                if (applyGifTag.success) {
                    if (C0DD.A0Q(c000400f, A07, file)) {
                        return;
                    }
                    Log.e("gif-helper/applyGifTag failed to apply tag properly.  Renaming marked file to original filepath unsuccessful");
                    throw new C04100In(0, "applyGifTag failed to apply tag properly.  Renaming marked file to original filepath unsuccessful");
                }
                StringBuilder sb = new StringBuilder();
                sb.append("gif-helper/applyGifTag");
                sb.append(applyGifTag.errorMessage);
                Log.e(sb.toString());
                int i = applyGifTag.errorCode;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("invalid result, error_code: ");
                sb2.append(i);
                throw new C04100In(i, sb2.toString());
            }
            Log.e("gif-helper/applyGifTag is null");
            throw new C04100In(0, "result is null");
        } catch (IOException e) {
            Log.e("Could not access file or failed to move files properly", e);
            throw new C04100In(0, "Could not access file or failed to move files properly");
        }
    }

    public static boolean A02(File file) {
        return file != null && hasGifTag(file.getAbsolutePath());
    }
}
