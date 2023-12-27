/**********************************************************************/
/*   ____  ____                                                       */
/*  /   /\/   /                                                       */
/* /___/  \  /                                                        */
/* \   \   \/                                                       */
/*  \   \        Copyright (c) 2003-2009 Xilinx, Inc.                */
/*  /   /          All Right Reserved.                                 */
/* /---/   /\                                                         */
/* \   \  /  \                                                      */
/*  \___\/\___\                                                    */
/***********************************************************************/

/* This file is designed for use with ISim build 0x7708f090 */

#define XSI_HIDE_SYMBOL_SPEC true
#include "xsi.h"
#include <memory.h>
#ifdef __GNUC__
#include <stdlib.h>
#else
#include <malloc.h>
#define alloca _alloca
#endif
static const char *ng0 = "E:/Xilinx/Computer Architecture Lab/Project/ALU/ALU.vhd";
extern char *IEEE_P_3620187407;
extern char *IEEE_P_2592010699;

char *ieee_p_2592010699_sub_1735675855_503743352(char *, char *, char *, char *, char *, char *);
char *ieee_p_3620187407_sub_767668596_3965413181(char *, char *, char *, char *, char *, char *);
char *ieee_p_3620187407_sub_767740470_3965413181(char *, char *, char *, char *, char *, char *);


static void work_a_0832606739_3212880686_p_0(char *t0)
{
    char t8[16];
    char t14[16];
    char *t1;
    char *t2;
    unsigned char t3;
    unsigned char t4;
    char *t5;
    char *t6;
    char *t7;
    char *t9;
    char *t10;
    int t11;
    unsigned int t12;
    unsigned char t13;
    char *t15;
    char *t16;
    char *t17;
    char *t18;
    char *t19;
    unsigned int t20;
    unsigned char t21;
    char *t22;
    char *t23;
    char *t24;
    char *t25;
    char *t26;

LAB0:    xsi_set_current_line(48, ng0);
    t1 = (t0 + 1032U);
    t2 = *((char **)t1);
    t3 = *((unsigned char *)t2);
    t4 = (t3 == (unsigned char)3);
    if (t4 != 0)
        goto LAB2;

LAB4:
LAB3:    t1 = (t0 + 3720);
    *((int *)t1) = 1;

LAB1:    return;
LAB2:    xsi_set_current_line(49, ng0);
    t1 = (t0 + 1192U);
    t5 = *((char **)t1);
    t1 = (t0 + 5948U);
    t6 = (t0 + 6137);
    t9 = (t8 + 0U);
    t10 = (t9 + 0U);
    *((int *)t10) = 0;
    t10 = (t9 + 4U);
    *((int *)t10) = 3;
    t10 = (t9 + 8U);
    *((int *)t10) = 1;
    t11 = (3 - 0);
    t12 = (t11 * 1);
    t12 = (t12 + 1);
    t10 = (t9 + 12U);
    *((unsigned int *)t10) = t12;
    t13 = ieee_std_logic_unsigned_equal_stdv_stdv(IEEE_P_3620187407, t5, t1, t6, t8);
    if (t13 != 0)
        goto LAB5;

LAB7:    t1 = (t0 + 1192U);
    t2 = *((char **)t1);
    t1 = (t0 + 5948U);
    t5 = (t0 + 6141);
    t7 = (t8 + 0U);
    t9 = (t7 + 0U);
    *((int *)t9) = 0;
    t9 = (t7 + 4U);
    *((int *)t9) = 3;
    t9 = (t7 + 8U);
    *((int *)t9) = 1;
    t11 = (3 - 0);
    t12 = (t11 * 1);
    t12 = (t12 + 1);
    t9 = (t7 + 12U);
    *((unsigned int *)t9) = t12;
    t3 = ieee_std_logic_unsigned_equal_stdv_stdv(IEEE_P_3620187407, t2, t1, t5, t8);
    if (t3 != 0)
        goto LAB10;

LAB11:    t1 = (t0 + 1192U);
    t2 = *((char **)t1);
    t1 = (t0 + 5948U);
    t5 = (t0 + 6145);
    t7 = (t8 + 0U);
    t9 = (t7 + 0U);
    *((int *)t9) = 0;
    t9 = (t7 + 4U);
    *((int *)t9) = 3;
    t9 = (t7 + 8U);
    *((int *)t9) = 1;
    t11 = (3 - 0);
    t12 = (t11 * 1);
    t12 = (t12 + 1);
    t9 = (t7 + 12U);
    *((unsigned int *)t9) = t12;
    t3 = ieee_std_logic_unsigned_equal_stdv_stdv(IEEE_P_3620187407, t2, t1, t5, t8);
    if (t3 != 0)
        goto LAB14;

LAB15:
LAB6:    goto LAB3;

LAB5:    xsi_set_current_line(50, ng0);
    t10 = (t0 + 1352U);
    t15 = *((char **)t10);
    t10 = (t0 + 5964U);
    t16 = (t0 + 1512U);
    t17 = *((char **)t16);
    t16 = (t0 + 5980U);
    t18 = ieee_p_2592010699_sub_1735675855_503743352(IEEE_P_2592010699, t14, t15, t10, t17, t16);
    t19 = (t14 + 12U);
    t12 = *((unsigned int *)t19);
    t20 = (1U * t12);
    t21 = (32U != t20);
    if (t21 == 1)
        goto LAB8;

LAB9:    t22 = (t0 + 3816);
    t23 = (t22 + 56U);
    t24 = *((char **)t23);
    t25 = (t24 + 56U);
    t26 = *((char **)t25);
    memcpy(t26, t18, 32U);
    xsi_driver_first_trans_fast(t22);
    xsi_set_current_line(51, ng0);
    t1 = (t0 + 3880);
    t2 = (t1 + 56U);
    t5 = *((char **)t2);
    t6 = (t5 + 56U);
    t7 = *((char **)t6);
    *((unsigned char *)t7) = (unsigned char)2;
    xsi_driver_first_trans_fast_port(t1);
    goto LAB6;

LAB8:    xsi_size_not_matching(32U, t20, 0);
    goto LAB9;

LAB10:    xsi_set_current_line(53, ng0);
    t9 = (t0 + 1352U);
    t10 = *((char **)t9);
    t9 = (t0 + 5964U);
    t15 = (t0 + 1512U);
    t16 = *((char **)t15);
    t15 = (t0 + 5980U);
    t17 = ieee_p_3620187407_sub_767668596_3965413181(IEEE_P_3620187407, t14, t10, t9, t16, t15);
    t18 = (t14 + 12U);
    t12 = *((unsigned int *)t18);
    t20 = (1U * t12);
    t4 = (32U != t20);
    if (t4 == 1)
        goto LAB12;

LAB13:    t19 = (t0 + 3816);
    t22 = (t19 + 56U);
    t23 = *((char **)t22);
    t24 = (t23 + 56U);
    t25 = *((char **)t24);
    memcpy(t25, t17, 32U);
    xsi_driver_first_trans_fast(t19);
    xsi_set_current_line(54, ng0);
    t1 = (t0 + 3880);
    t2 = (t1 + 56U);
    t5 = *((char **)t2);
    t6 = (t5 + 56U);
    t7 = *((char **)t6);
    *((unsigned char *)t7) = (unsigned char)2;
    xsi_driver_first_trans_fast_port(t1);
    goto LAB6;

LAB12:    xsi_size_not_matching(32U, t20, 0);
    goto LAB13;

LAB14:    xsi_set_current_line(56, ng0);
    t9 = (t0 + 1352U);
    t10 = *((char **)t9);
    t9 = (t0 + 5964U);
    t15 = (t0 + 1512U);
    t16 = *((char **)t15);
    t15 = (t0 + 5980U);
    t17 = ieee_p_3620187407_sub_767740470_3965413181(IEEE_P_3620187407, t14, t10, t9, t16, t15);
    t18 = (t14 + 12U);
    t12 = *((unsigned int *)t18);
    t20 = (1U * t12);
    t4 = (32U != t20);
    if (t4 == 1)
        goto LAB16;

LAB17:    t19 = (t0 + 3816);
    t22 = (t19 + 56U);
    t23 = *((char **)t22);
    t24 = (t23 + 56U);
    t25 = *((char **)t24);
    memcpy(t25, t17, 32U);
    xsi_driver_first_trans_fast(t19);
    xsi_set_current_line(57, ng0);
    t1 = (t0 + 1352U);
    t2 = *((char **)t1);
    t1 = (t0 + 5964U);
    t5 = (t0 + 1512U);
    t6 = *((char **)t5);
    t5 = (t0 + 5980U);
    t3 = ieee_std_logic_unsigned_equal_stdv_stdv(IEEE_P_3620187407, t2, t1, t6, t5);
    if (t3 != 0)
        goto LAB18;

LAB20:    xsi_set_current_line(60, ng0);
    t1 = (t0 + 3880);
    t2 = (t1 + 56U);
    t5 = *((char **)t2);
    t6 = (t5 + 56U);
    t7 = *((char **)t6);
    *((unsigned char *)t7) = (unsigned char)2;
    xsi_driver_first_trans_fast_port(t1);

LAB19:    goto LAB6;

LAB16:    xsi_size_not_matching(32U, t20, 0);
    goto LAB17;

LAB18:    xsi_set_current_line(58, ng0);
    t7 = (t0 + 3880);
    t9 = (t7 + 56U);
    t10 = *((char **)t9);
    t15 = (t10 + 56U);
    t16 = *((char **)t15);
    *((unsigned char *)t16) = (unsigned char)3;
    xsi_driver_first_trans_fast_port(t7);
    goto LAB19;

}

static void work_a_0832606739_3212880686_p_1(char *t0)
{
    char *t1;
    char *t2;
    char *t3;
    char *t4;
    char *t5;
    char *t6;
    char *t7;

LAB0:    xsi_set_current_line(65, ng0);

LAB3:    t1 = (t0 + 1992U);
    t2 = *((char **)t1);
    t1 = (t0 + 3944);
    t3 = (t1 + 56U);
    t4 = *((char **)t3);
    t5 = (t4 + 56U);
    t6 = *((char **)t5);
    memcpy(t6, t2, 32U);
    xsi_driver_first_trans_fast_port(t1);

LAB2:    t7 = (t0 + 3736);
    *((int *)t7) = 1;

LAB1:    return;
LAB4:    goto LAB2;

}


extern void work_a_0832606739_3212880686_init()
{
	static char *pe[] = {(void *)work_a_0832606739_3212880686_p_0,(void *)work_a_0832606739_3212880686_p_1};
	xsi_register_didat("work_a_0832606739_3212880686", "isim/MIPS_MIPS_sch_tb_isim_beh.exe.sim/work/a_0832606739_3212880686.didat");
	xsi_register_executes(pe);
}
