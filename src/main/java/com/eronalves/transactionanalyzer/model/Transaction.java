package com.eronalves.transactionanalyzer.model;

/**
 * Transaction
 */
public class Transaction {

  private final Trader trader;
  private final int year;
  private final float value;
  private final Currency currency;

  public Transaction(Trader trader, int year, float value, Currency currency) {
    this.trader = trader;
    this.year = year;
    this.value = value;
    this.currency = currency;
  }

  public enum Currency {
    USD, BRL, YEN, AUR, JPY;
  }

  public Trader getTrader() {
    return trader;
  }

  public int getYear() {
    return year;
  }

  public float getValue() {
    return value;
  }

  public Currency getCurrency() {
    return currency;
  }

}
