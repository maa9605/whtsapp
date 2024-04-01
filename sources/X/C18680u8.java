package X;

import java.util.Random;

/* renamed from: X.0u8  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C18680u8 {
    public static final C18680u8 A07;
    public static final C18680u8 A08;
    public static final C18680u8 A09;
    public static final C18680u8 A0A;
    public static final C18680u8 A0B;
    public static final C18680u8 A0C;
    public static final C18680u8 A0D;
    public static final C18680u8 A0E;
    public static final C18680u8 A0F;
    public static final C18680u8 A0G;
    public static final C18680u8 A0H;
    public static final C18680u8 A0I;
    public static final C18680u8 A0J;
    public static final C18680u8 A0K;
    public static final C18680u8 A0L;
    public static final C18680u8 A0M;
    public static final C18680u8 A0N;
    public static final C18680u8 A0O;
    public static final C18680u8 A0P;
    public static final C18680u8 A0Q;
    public static final C18680u8 A0R;
    public static final C18680u8 A0S;
    public static final C18680u8 A0T;
    public static final C18680u8 A0U;
    public static final Random A0V;
    public static final C18680u8[] A0W;
    public int A00 = 0;
    public long A01 = Long.MIN_VALUE;
    public long A02 = Long.MAX_VALUE;
    public long A03 = 0;
    public long[] A04;
    public final String A05;
    public final boolean A06;

    static {
        C18680u8 c18680u8 = new C18680u8("oxygen_map_draw_time_ns", false);
        A0D = c18680u8;
        C18680u8 c18680u82 = new C18680u8("oxygen_map_layout_time_ns", false);
        A0K = c18680u82;
        A0T = new C18680u8("oxygen_map_touch_event_time_ns", false);
        C18680u8 c18680u83 = new C18680u8("oxygen_map_tile_download_time_ns", true);
        A0S = c18680u83;
        C18680u8 c18680u84 = new C18680u8("oxygen_map_tile_download_size", true);
        A0R = c18680u84;
        C18680u8 c18680u85 = new C18680u8("oxygen_map_tree_compaction_time", true);
        A0U = c18680u85;
        C18680u8 c18680u86 = new C18680u8("oxygen_map_marker_draw_time", false);
        A0M = c18680u86;
        C18680u8 c18680u87 = new C18680u8("oxygen_map_marker_touch_detection_time", false);
        A0N = c18680u87;
        C18680u8 c18680u88 = new C18680u8("oxygen_map_info_window_draw_time", false);
        A0J = c18680u88;
        A0L = new C18680u8("oxygen_map_tile_overlay_draw_time_ns", false);
        A0W = new C18680u8[]{c18680u8, c18680u82, c18680u83, c18680u84, c18680u85, c18680u86, c18680u87, c18680u88};
        A07 = new C18680u8("oxygen_map_bitmap_reuse_error", true);
        A0A = new C18680u8("oxygen_map_disk_cache_null_key_error", true);
        A0C = new C18680u8("oxygen_map_disk_cache_write_error", true);
        A0B = new C18680u8("oxygen_map_disk_cache_read_error", true);
        A09 = new C18680u8("oxygen_map_disk_cache_init_error", true);
        A08 = new C18680u8("oxygen_map_config_fetch_error", true);
        A0Q = new C18680u8("oxygen_map_tile_download_error", true);
        A0I = new C18680u8("oxygen_map_empty_cluster_error", true);
        A0P = new C18680u8("oxygen_map_suppressed_drain_to_byte_array_error", true);
        A0O = new C18680u8("oxygen_map_runtime_permission_error", true);
        A0G = new C18680u8("oxygen_map_dynamic_map_view_impression", false);
        A0H = new C18680u8("oxygen_map_dynamic_map_warm_tti_ns", false);
        A0E = new C18680u8("oxygen_map_dynamic_map_cold_tti_ns", false);
        A0F = new C18680u8("oxygen_map_dynamic_map_stats_per_impression", false);
        A0V = new Random();
    }

    public C18680u8(String str, boolean z) {
        this.A05 = str;
        this.A06 = z;
    }

    public void A00() {
        if (this.A06) {
            synchronized (this) {
            }
        }
    }

    public void A01() {
        if (this.A06) {
            synchronized (this) {
            }
        }
    }

    public void A02() {
        if (this.A06) {
            synchronized (this) {
                this.A01 = Long.MIN_VALUE;
                this.A02 = Long.MAX_VALUE;
                this.A03 = 0L;
                this.A00 = 0;
            }
            return;
        }
        this.A01 = Long.MIN_VALUE;
        this.A02 = Long.MAX_VALUE;
        this.A03 = 0L;
        this.A00 = 0;
    }

    public void A03(long j) {
        if (this.A06) {
            synchronized (this) {
                A04(j);
            }
            return;
        }
        A04(j);
    }

    public final void A04(long j) {
        long[] jArr = this.A04;
        if (jArr == null) {
            jArr = new long[256];
            this.A04 = jArr;
        }
        long j2 = this.A01;
        if (j2 <= j) {
            j2 = j;
        }
        this.A01 = j2;
        long j3 = this.A02;
        if (j3 >= j) {
            j3 = j;
        }
        this.A02 = j3;
        this.A03 += j;
        int i = this.A00;
        if (i < 256) {
            jArr[i] = j;
        } else {
            int nextInt = A0V.nextInt(i + 1);
            if (nextInt < 256) {
                jArr[nextInt] = j;
            }
        }
        int i2 = i + 1;
        this.A00 = i2;
        if (i2 == 256) {
            A02();
        }
    }
}
