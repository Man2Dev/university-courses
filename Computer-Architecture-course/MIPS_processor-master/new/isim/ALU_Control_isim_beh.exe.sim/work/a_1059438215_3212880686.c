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
static const char *ng0 = "C:/Users/home/Desktop/tempp/ALUControl.vhd";
extern char *IEEE_P_3620187407;



static void work_a_1059438215_3212880686_p_0(char *t0)
{
    char t5[16];
    char *t1;
    char *t2;
    char *t3;
    char *t4;
    char *t6;
    char *t7;
    int t8;
    unsigned int t9;
    unsigned char t10;
    char *t11;
    char *t12;
    char *t13;
    char *t14;
    char *t15;
    char *t16;
    int t17;
    int t18;
    int t19;
    char *t20;
    int t22;
    char *t23;
    int t25;
    char *t26;
    int t28;
    char *t29;
    int t31;
    char *t32;
    int t34;
    char *t35;
    int t37;
    char *t38;
    char *t40;
    char *t41;
    char *t42;
    char *t43;
    char *t44;

LAB0:    xsi_set_current_line(48, ng0);
    t1 = (t0 + 1032U);
    t2 = *((char **)t1);
    t1 = (t0 + 4580U);
    t3 = (t0 + 4644);
    t6 = (t5 + 0U);
    t7 = (t6 + 0U);
    *((int *)t7) = 0;
    t7 = (t6 + 4U);
    *((int *)t7) = 1;
    t7 = (t6 + 8U);
    *((int *)t7) = 1;
    t8 = (1 - 0);
    t9 = (t8 * 1);
    t9 = (t9 + 1);
    t7 = (t6 + 12U);
    *((unsigned int *)t7) = t9;
    t10 = ieee_std_logic_unsigned_equal_stdv_stdv(IEEE_P_3620187407, t2, t1, t3, t5);
    if (t10 != 0)
        goto LAB2;

LAB4:    t1 = (t0 + 1032U);
    t2 = *((char **)t1);
    t1 = (t0 + 4580U);
    t3 = (t0 + 4650);
    t6 = (t5 + 0U);
    t7 = (t6 + 0U);
    *((int *)t7) = 0;
    t7 = (t6 + 4U);
    *((int *)t7) = 1;
    t7 = (t6 + 8U);
    *((int *)t7) = 1;
    t8 = (1 - 0);
    t9 = (t8 * 1);
    t9 = (t9 + 1);
    t7 = (t6 + 12U);
    *((unsigned int *)t7) = t9;
    t10 = ieee_std_logic_unsigned_equal_stdv_stdv(IEEE_P_3620187407, t2, t1, t3, t5);
    if (t10 != 0)
        goto LAB5;

LAB6:    t1 = (t0 + 1032U);
    t2 = *((char **)t1);
    t1 = (t0 + 4580U);
    t3 = (t0 + 4656);
    t6 = (t5 + 0U);
    t7 = (t6 + 0U);
    *((int *)t7) = 0;
    t7 = (t6 + 4U);
    *((int *)t7) = 1;
    t7 = (t6 + 8U);
    *((int *)t7) = 1;
    t8 = (1 - 0);
    t9 = (t8 * 1);
    t9 = (t9 + 1);
    t7 = (t6 + 12U);
    *((unsigned int *)t7) = t9;
    t10 = ieee_std_logic_unsigned_equal_stdv_stdv(IEEE_P_3620187407, t2, t1, t3, t5);
    if (t10 != 0)
        goto LAB7;

LAB8:    xsi_set_current_line(67, ng0);
    t1 = (t0 + 4752);
    t3 = (t0 + 2912);
    t4 = (t3 + 56U);
    t6 = *((char **)t4);
    t7 = (t6 + 56U);
    t11 = *((char **)t7);
    memcpy(t11, t1, 4U);
    xsi_driver_first_trans_fast_port(t3);

LAB3:    t1 = (t0 + 2832);
    *((int *)t1) = 1;

LAB1:    return;
LAB2:    xsi_set_current_line(49, ng0);
    t7 = (t0 + 4646);
    t12 = (t0 + 2912);
    t13 = (t12 + 56U);
    t14 = *((char **)t13);
    t15 = (t14 + 56U);
    t16 = *((char **)t15);
    memcpy(t16, t7, 4U);
    xsi_driver_first_trans_fast_port(t12);
    goto LAB3;

LAB5:    xsi_set_current_line(51, ng0);
    t7 = (t0 + 4652);
    t12 = (t0 + 2912);
    t13 = (t12 + 56U);
    t14 = *((char **)t13);
    t15 = (t14 + 56U);
    t16 = *((char **)t15);
    memcpy(t16, t7, 4U);
    xsi_driver_first_trans_fast_port(t12);
    goto LAB3;

LAB7:    xsi_set_current_line(54, ng0);
    t7 = (t0 + 1192U);
    t11 = *((char **)t7);
    t7 = (t0 + 4658);
    t17 = xsi_mem_cmp(t7, t11, 6U);
    if (t17 == 1)
        goto LAB10;

LAB20:    t13 = (t0 + 4664);
    t18 = xsi_mem_cmp(t13, t11, 6U);
    if (t18 == 1)
        goto LAB11;

LAB21:    t15 = (t0 + 4670);
    t19 = xsi_mem_cmp(t15, t11, 6U);
    if (t19 == 1)
        goto LAB12;

LAB22:    t20 = (t0 + 4676);
    t22 = xsi_mem_cmp(t20, t11, 6U);
    if (t22 == 1)
        goto LAB13;

LAB23:    t23 = (t0 + 4682);
    t25 = xsi_mem_cmp(t23, t11, 6U);
    if (t25 == 1)
        goto LAB14;

LAB24:    t26 = (t0 + 4688);
    t28 = xsi_mem_cmp(t26, t11, 6U);
    if (t28 == 1)
        goto LAB15;

LAB25:    t29 = (t0 + 4694);
    t31 = xsi_mem_cmp(t29, t11, 6U);
    if (t31 == 1)
        goto LAB16;

LAB26:    t32 = (t0 + 4700);
    t34 = xsi_mem_cmp(t32, t11, 6U);
    if (t34 == 1)
        goto LAB17;

LAB27:    t35 = (t0 + 4706);
    t37 = xsi_mem_cmp(t35, t11, 6U);
    if (t37 == 1)
        goto LAB18;

LAB28:
LAB19:    xsi_set_current_line(64, ng0);
    t1 = (t0 + 4748);
    t3 = (t0 + 2912);
    t4 = (t3 + 56U);
    t6 = *((char **)t4);
    t7 = (t6 + 56U);
    t11 = *((char **)t7);
    memcpy(t11, t1, 4U);
    xsi_driver_first_trans_fast_port(t3);

LAB9:    goto LAB3;

LAB10:    xsi_set_current_line(55, ng0);
    t38 = (t0 + 4712);
    t40 = (t0 + 2912);
    t41 = (t40 + 56U);
    t42 = *((char **)t41);
    t43 = (t42 + 56U);
    t44 = *((char **)t43);
    memcpy(t44, t38, 4U);
    xsi_driver_first_trans_fast_port(t40);
    goto LAB9;

LAB11:    xsi_set_current_line(56, ng0);
    t1 = (t0 + 4716);
    t3 = (t0 + 2912);
    t4 = (t3 + 56U);
    t6 = *((char **)t4);
    t7 = (t6 + 56U);
    t11 = *((char **)t7);
    memcpy(t11, t1, 4U);
    xsi_driver_first_trans_fast_port(t3);
    goto LAB9;

LAB12:    xsi_set_current_line(57, ng0);
    t1 = (t0 + 4720);
    t3 = (t0 + 2912);
    t4 = (t3 + 56U);
    t6 = *((char **)t4);
    t7 = (t6 + 56U);
    t11 = *((char **)t7);
    memcpy(t11, t1, 4U);
    xsi_driver_first_trans_fast_port(t3);
    goto LAB9;

LAB13:    xsi_set_current_line(58, ng0);
    t1 = (t0 + 4724);
    t3 = (t0 + 2912);
    t4 = (t3 + 56U);
    t6 = *((char **)t4);
    t7 = (t6 + 56U);
    t11 = *((char **)t7);
    memcpy(t11, t1, 4U);
    xsi_driver_first_trans_fast_port(t3);
    goto LAB9;

LAB14:    xsi_set_current_line(59, ng0);
    t1 = (t0 + 4728);
    t3 = (t0 + 2912);
    t4 = (t3 + 56U);
    t6 = *((char **)t4);
    t7 = (t6 + 56U);
    t11 = *((char **)t7);
    memcpy(t11, t1, 4U);
    xsi_driver_first_trans_fast_port(t3);
    goto LAB9;

LAB15:    xsi_set_current_line(60, ng0);
    t1 = (t0 + 4732);
    t3 = (t0 + 2912);
    t4 = (t3 + 56U);
    t6 = *((char **)t4);
    t7 = (t6 + 56U);
    t11 = *((char **)t7);
    memcpy(t11, t1, 4U);
    xsi_driver_first_trans_fast_port(t3);
    goto LAB9;

LAB16:    xsi_set_current_line(61, ng0);
    t1 = (t0 + 4736);
    t3 = (t0 + 2912);
    t4 = (t3 + 56U);
    t6 = *((char **)t4);
    t7 = (t6 + 56U);
    t11 = *((char **)t7);
    memcpy(t11, t1, 4U);
    xsi_driver_first_trans_fast_port(t3);
    goto LAB9;

LAB17:    xsi_set_current_line(62, ng0);
    t1 = (t0 + 4740);
    t3 = (t0 + 2912);
    t4 = (t3 + 56U);
    t6 = *((char **)t4);
    t7 = (t6 + 56U);
    t11 = *((char **)t7);
    memcpy(t11, t1, 4U);
    xsi_driver_first_trans_fast_port(t3);
    goto LAB9;

LAB18:    xsi_set_current_line(63, ng0);
    t1 = (t0 + 4744);
    t3 = (t0 + 2912);
    t4 = (t3 + 56U);
    t6 = *((char **)t4);
    t7 = (t6 + 56U);
    t11 = *((char **)t7);
    memcpy(t11, t1, 4U);
    xsi_driver_first_trans_fast_port(t3);
    goto LAB9;

LAB29:;
}


extern void work_a_1059438215_3212880686_init()
{
	static char *pe[] = {(void *)work_a_1059438215_3212880686_p_0};
	xsi_register_didat("work_a_1059438215_3212880686", "isim/ALU_Control_isim_beh.exe.sim/work/a_1059438215_3212880686.didat");
	xsi_register_executes(pe);
}
