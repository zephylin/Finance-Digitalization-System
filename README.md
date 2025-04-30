# Finance Digitalization System

A modular Java system for managing financial workflows, customer accounts, document synchronization, and compliance.  
Includes core business logic, APIs, services, and automated CI/CD via GitHub Actions.

---

## 📌 Overview

This system provides a foundation for digitalizing financial operations with:  
✅ Customer account management  
✅ Document synchronization and metadata handling  
✅ Compliance checks and audit logging  
✅ API endpoints for integrations  
✅ Automated delivery preferences and notifications  

---

## 🚀 Key Components

### **Core Classes**
- **Domain Models**:  
  `Customer.java`, `Account.java`, `Document.java`, `DeliveryPreference.java`, `DocumentMetadata.java`
- **Services**:  
  `AuthenticationService.java`, `ComplianceService.java`, `NotificationService.java`, `DocSyncService.java`
- **APIs**:  
  `CheckCustomerAcctAPI.java`, `GetAllAccountsAPI.java`, `SyncDeliveryPreferenceAPI.java`
- **Integrations**:  
  `FTPIntegration.java`, `AuditLog.java`

### **Features**
- Identity validation and customer registration workflows
- Document synchronization with metadata tracking
- Compliance checks for regulatory adherence
- FTP integration for file transfers
- Automated notifications and audit logging

---

## 🛠️ Tech Stack
- **Language**: Java 17  
- **Testing**: JUnit 5, Mockito  
- **Build Tool**: Maven  
- **CI/CD**: GitHub Actions  

---

## 🚨 Getting Started

### Prerequisites
- Java 17
- Maven 3.8+

### Setup
1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/finance-digitalization-system.git
